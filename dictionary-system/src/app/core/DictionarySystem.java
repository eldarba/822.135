package app.core;

import java.util.Scanner;
import java.util.Set;

import app.core.exceptions.DictionaryException;

public class DictionarySystem {

	private Dictionary dictionary = new Dictionary();
	private Scanner scanner = new Scanner(System.in);
	private boolean systemOn;

	public void start() {
		systemOn = true;
		while (systemOn) {
			try {
				printMenu();
				String command = scanner.nextLine();
				switch (command) {
				case "add":
				case "a":
					doAdd();
					break;
				case "find":
				case "f":
					doFind();
					break;
				case "edit":
				case "e":
					doEdit();
					break;
				case "remove":
				case "r":
					doRemove();
					break;
				case "display":
				case "d":
					doDisplayAll();
					break;
				case "exit":
				case "q":
					this.systemOn = false;
					this.scanner.close();
					this.dictionary.saveData();
					break;

				default:
					break;
				}
			} catch (DictionaryException e) {
//				e.printStackTrace();
				System.out.println("Error: " + e.getMessage());
			}
		}

		System.out.println("Bye!!!");
	}

	private void doDisplayAll() {
		Set<String> set = this.dictionary.getAllEntriesSorted();
		System.out.println("=== All Entries:");
		for (String entry : set) {
			System.out.println(entry);
		}
		System.out.println("================");
	}

	private void doRemove() {
		System.out.print("enter entry to remove: ");
		String entry = scanner.nextLine();
		this.dictionary.deleteEntry(entry);
	}

	private void doEdit() throws DictionaryException {
		System.out.print("enter entry to edit: ");
		String entry = scanner.nextLine();
		System.out.print("enter the new definition: ");
		String definition = scanner.nextLine();
		this.dictionary.editEntry(entry, definition);
	}

	private void doFind() {
		System.out.print("enter entry to find: ");
		String entry = scanner.nextLine();
		String def = this.dictionary.getDefinition(entry);
		if (def == null) {
			def = "NOT FOUND";
		}
		System.out.println("definition: " + def);

	}

	private void doAdd() throws DictionaryException {
		System.out.print("enter entry to add: ");
		String entry = scanner.nextLine();
		System.out.print("enter definition to add: ");
		String definition = scanner.nextLine();
		this.dictionary.addEntry(entry, definition);
	}

	public void printMenu() {
		System.out.println("\n\n=== Dictionary System Menu");
		System.out.println("Add Entry ........... add / a");
		System.out.println("Find Entry .......... find / f");
		System.out.println("Edit Entry .......... edit / e");
		System.out.println("Remove Entry ........ remove / r");
		System.out.println("Display All ......... display / d");
		System.out.println("Exit ................ exit / q");
		System.out.print("Enter Choice: ");
	}

}

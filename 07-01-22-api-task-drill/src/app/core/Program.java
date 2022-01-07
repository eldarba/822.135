package app.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {

	private Scanner sc = new Scanner(System.in);
	private int nextTaskId = 1;
	private Scheduler scheduler = new Scheduler();
	private boolean quit;

	public static void main(String[] args) {

		Program p = new Program();
		lbl: while (!p.quit) {
			try {
				p.showMenu();
				String command = p.sc.nextLine();
				switch (command) {
				case "add":
					p.doAdd();
					break;
				case "rem":
					p.doRemove();
					break;
				case "disp":
					p.scheduler.displayTasks();
					break;
				case "do":
					p.doTask();
					break;
				case "monitor":
					p.scheduler.startMonitoringTasks();
					break;
				case "x":
					p.scheduler.stopMonitoringTasks();
					break lbl;
				default:
					System.out.println(command + " is not a supported command");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
//				e.printStackTrace();
			}
		}

		p.sc.close();
		System.out.println("Bye");

	}

	private void doRemove() {
		System.out.print("enter task id to remove: ");
		int taskId = Integer.parseInt(sc.nextLine());
		if (scheduler.removeTask(taskId)) {
			System.out.println("DELETED task: " + taskId);
		} else {
			System.out.println("NOT DELETED task: " + taskId + " - not found");
		}

	}

	private void doTask() {
		System.out.print("enter task id to do: ");
		int taskId = Integer.parseInt(sc.nextLine());
		Task taskToDo = scheduler.getTaskById(taskId);
		if (taskToDo != null) {
			taskToDo.doTask();
			System.out.println("COMPLETED: " + taskToDo);
		} else {
			System.out.println("task id " + taskId + " not found");
		}
	}

	private void doAdd() {
		System.out.print("enter task description: ");
		String description = sc.nextLine();
		System.out.print("enter date [yyyy-mm-dd] : ");
		LocalDate date = LocalDate.parse(sc.nextLine()); // yyyy-mm-dd
		System.out.print("enter time [hh:mm:ss] : ");
		LocalTime time = LocalTime.parse(sc.nextLine()); // hh:mm:ss
		LocalDateTime deadline = LocalDateTime.of(date, time);
		Task task = new Task(nextTaskId++, description, deadline);
		scheduler.addTask(task);
	}

	public void showMenu() {
		System.out.println("\n=====Tasks Menu============");
		System.out.println("add task ..................... add");
		System.out.println("remove task .................. rem");
		System.out.println("display tasks................. disp");
		System.out.println("do task ...................... do");
		System.out.println("start monitoring ............. monitor");
		System.out.println("quit ......................... x");
		System.out.print("your choice: ");
	}

}

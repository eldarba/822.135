package b;

import java.util.Scanner;

public class AppGetUserDetails {

	public static void main(String[] args) {

		ReminderThread t = new ReminderThread("go ahead...", 5, 1);
		t.start();

		try (Scanner sc = new Scanner(System.in);) {
			System.out.print("enter name: ");
			String name = sc.nextLine();
			System.out.print("enter password: ");
			String password = sc.nextLine();
			System.out.println("Thanks");
			System.out.println("you entered name: " + name + ", password: " + password);
		}

		t.interrupt();

	}

}

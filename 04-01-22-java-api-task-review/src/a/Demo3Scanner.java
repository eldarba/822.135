package a;

import java.util.Scanner;

public class Demo3Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("enter name: ");
		String name = sc.nextLine();
		System.out.print("enter age: ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.println("name: " + name);
		System.out.println("age: " + age);

		sc.close();

	}

}

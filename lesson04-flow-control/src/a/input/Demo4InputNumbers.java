package a.input;

import java.util.Scanner;

public class Demo4InputNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		int a = sc.nextInt();
		System.out.print("enter another number: ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
		sc.close();

	}

}

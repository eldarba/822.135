package b.flow.control.loops;

import java.util.Scanner;

public class Demo03While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter password: ");
		int pass = sc.nextInt();
		
		while(pass != 123) {
			System.out.print("invalid password, try again: ");
			pass = sc.nextInt();
		}
		
		sc.close();
		System.out.println("you are logged in");
	
	}

}

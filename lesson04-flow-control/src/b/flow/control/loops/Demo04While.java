package b.flow.control.loops;

import java.util.Scanner;

public class Demo04While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter password: ");
		int pass = sc.nextInt();
		int attempts = 1;
		
		while(pass != 123 && attempts < 3) {
			attempts++;
			System.out.println(attempts);
			System.out.print("invalid password, try again: ");
			pass = sc.nextInt();
		}
		
		sc.close();
		
		if(pass == 123) {
			System.out.println("you are logged in");
		}else {
			System.out.println("login failed");
		}
	
	}

}

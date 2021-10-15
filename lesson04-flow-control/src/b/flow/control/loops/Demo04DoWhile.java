package b.flow.control.loops;

import java.util.Scanner;

public class Demo04DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pass;
		
		do{
			System.out.print("enter password: ");
			pass = sc.nextInt();
		}while(pass != 123);
		
		sc.close();
		System.out.println("you are logged in");
	
	}

}

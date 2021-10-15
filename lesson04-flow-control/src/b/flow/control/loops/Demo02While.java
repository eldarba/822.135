package b.flow.control.loops;

import java.util.Scanner;

public class Demo02While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("enter number (negative to quit): ");
		int n = sc.nextInt();
		
		while(n >= 0) {
			sum += n;
			System.out.print("enter another number (negative to quit): ");
			n = sc.nextInt();
		}
		
		sc.close();
		System.out.println("the sum is: " + sum); 

	}

}

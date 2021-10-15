package a.input;

import java.util.Scanner;

public class Demo2Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name and address");
		String name = sc.next(); // get the first token
		String address = sc.next(); // get the second token
		System.out.println("name: " + name);
		System.out.println("address :" + address);
		
		sc.close(); // closing the scanner
		
	}

}

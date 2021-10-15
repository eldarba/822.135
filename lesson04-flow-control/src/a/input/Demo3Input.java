package a.input;

import java.util.Scanner;

public class Demo3Input {

	public static void main(String[] args) {
		// create a Scanner instance (object)
		Scanner sc = new Scanner(System.in);
		// prompt user for input
		System.out.println("enter a line of text");
		// get line as input from user
		String line = sc.nextLine();
		// print the line
		System.out.println(line);
		// close the scanner
		sc.close();
	} 

	
}

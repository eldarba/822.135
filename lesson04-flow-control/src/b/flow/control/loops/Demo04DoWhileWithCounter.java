package b.flow.control.loops;

import java.util.Scanner;

public class Demo04DoWhileWithCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pass;
		int attempt = 0;

		do {
			attempt++;
			System.out.print("attempt #" + attempt + " enter password: ");
			pass = sc.nextInt();
		} while (pass != 123 && attempt < 3);

		sc.close();
		if (pass == 123) {
			System.out.println("you are logged in");
		} else {
			System.out.println("login failed");
		}

	}

}

package b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ApplicationExceptions {

	public static void main(String[] args) {

		File file = new File("c:/eldar/x");
		System.out.println(file);

		Scanner sc = null;
		try {
			sc = new Scanner(file);
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

		System.out.println("Success");

	}

}

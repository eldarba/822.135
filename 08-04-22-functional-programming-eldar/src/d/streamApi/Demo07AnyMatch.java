package d.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo07AnyMatch {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 7, 7, 9, 2, 3, 7);
		System.out.println(list);

		// is there any 5 in the list
		boolean any5 = list.stream().anyMatch((e) -> e == 5);

		System.out.println("is there a 5? " + any5);

		System.out.println("========================");
		// drill
		List<String> names = Arrays.asList("Dan", "Ran", "Yoav", "ronen", "Lea");
		System.out.println(names);

		// get a letter from user
		// print a message stating if there is a name starting with that letter or not
		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st character: ");
		char c = sc.next().toLowerCase().charAt(0);
		sc.close();
		System.out.println("first character is " + c);

		boolean found = names.stream().map(e -> e.toLowerCase()).anyMatch(e -> e.startsWith(String.valueOf(c)));
		if (found) {
			System.out.println("a name starting with " + c + " found");
		} else {
			System.out.println("a name starting with " + c + " NOT found");
		}

	}

}

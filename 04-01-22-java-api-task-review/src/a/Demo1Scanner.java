package a;

import java.util.Scanner;

public class Demo1Scanner {

	public static void main(String[] args) {

		Scanner sc;

		String str = "aaa,bbb ccc ddd\n111 222 333";
		sc = new Scanner(str);
		sc.useDelimiter(",");

//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());

//		System.out.println(sc.nextLine());
//		int x;
//		x = sc.nextInt();
//		System.out.println(x);

		System.out.println(sc.next());

		sc.close();

	}

}

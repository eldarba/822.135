package d;

import b.Person;

public class Operators {

	public static void main(String[] args) {

		int x = 5;
		System.out.println(x);
		System.out.println(-x);

		boolean b = true;
		System.out.println(b);
		System.out.println(!b);

		Person p = new Person();
		System.out.println(p instanceof Person);

		// ternary operator boolean?true :false
		int n1 = 5;
		int n2 = 32;
		int max = n1 > n2 ? n1 : n2;
		System.out.println(max);

	}

}

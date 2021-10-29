package c.finals;

public class Demo1 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);

		a = 7;
		System.out.println(a);

		// final on a variable - cannot be reassigned after initialization
		final int b = 20;
		System.out.println(b);

//		b = 100;

	}

}

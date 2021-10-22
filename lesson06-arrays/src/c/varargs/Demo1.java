package c.varargs;

public class Demo1 {

	public static void main(String... args) {

		int a = 5;
		int b = 9;
		// method invocation (call)
		// a and b are method arguments
		int sum = sum(a, b);

		// invoke the varargs method
		sum = sum(a, b, 6, 8, 2);
		System.out.println("sum is: " + sum);

	}

	// method definition
	// a and b are method parameters
	public static int sum(int a, int b) {
		return a + b;
	}

	// the args parameter is an array in the method
	// caller can send args as separate int values
	public static int sum(int... args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}

	public static int sum(String name, int... args) {
		System.out.println("hello " + name);
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		return sum;
	}

}

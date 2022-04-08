package b.theFunctionalInterfaces;

import java.util.function.Function;

public class Demo1BFunction {

	public static void main(String[] args) {

		// parse string to int

		Function<String, Integer> parser = str -> Integer.parseInt(str);

		String a = "250";
		String b = "32";
		int x = parser.apply(a);
		int y = parser.apply(b);

		System.out.println(x + " + " + y + " = " + (x + y));

	}

}

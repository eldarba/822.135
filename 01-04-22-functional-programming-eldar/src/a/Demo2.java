package a;

public class Demo2 {

	public static void main(String[] args) {

		Calculator plusCalc = (a, b) -> a + b;
		Calculator minusCalc = (a, b) -> a - b;

		System.out.println(plusCalc.calculate(10, 3));
		System.out.println(minusCalc.calculate(10, 3));

	}

	@FunctionalInterface
	interface Calculator {
		double calculate(double a, double b);
	}

}

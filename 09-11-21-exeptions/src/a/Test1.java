package a;

public class Test1 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.sum(4, 5));

		try { // try to call the method
			System.out.println(calc.div(10, 3));
			System.out.println(calc.div(10, 0));
		} catch (Exception e) { // catch the Exception object
			// HANDLER code
			// e is a reference to the thrown Exception object
			System.out.println("error: " + e.getMessage());
		}

		System.out.println("END PROGRAM");

	}
}

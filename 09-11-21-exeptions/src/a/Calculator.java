package a;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int div(int a, int b) throws Exception { // throws declaration
		if (b != 0) {
			return a / b; // return - ends the method on success
		} else {
			// create an Exception Object
			Exception e = new Exception("divide by 0");
			// throw an Exception Object
			throw e; // throw - end the method on failure
		}
	}

}

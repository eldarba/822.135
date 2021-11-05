package f.classNesting;

public class Outer {

	// inner class
	public class Inner {

	}

	// static nested class
	public static class nestedClass {

	}

	public static void main(String[] args) {

		nestedClass nc = new nestedClass();

		Outer outer = new Outer();
		Inner inner = outer.new Inner();
	}

}

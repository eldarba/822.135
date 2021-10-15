package b.flow.control.loops;

public class Demo10ForFactorial {

	public static void main(String[] args) {

		int n = 9;

		int f = 1;

		for (int x = 2; x <= n; x++) {
			f *= x;
		}

		System.out.println(n + "! = " + f);

	}

}

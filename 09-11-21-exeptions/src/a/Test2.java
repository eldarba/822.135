package a;

public class Test2 {

	public static void main(String[] args) {
		try {
			int res = a(10, 0);
			System.out.println("the result is: " + res);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("We are very sory." + e.getMessage());
		}
		System.out.println("END");
	}

	public static int a(int a, int b) throws Exception {
		int res = b(a, b);
		return res;
	}

	public static int b(int a, int b) throws Exception {
		int res = c(a, b);
		return res;
	}

	public static int c(int a, int b) throws Exception {
		Calculator calc = new Calculator();
		int res = calc.div(a, b);
		return res;
	}
}

package a.recursion;

public class Demo4 {

	/* write the algorithm using recursion */

	/**
	 * print all numbers from a to b (a is less than b)
	 * 
	 * @param a
	 * @param b
	 */
	public static void printAToB(int a, int b) {
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		// base case
		if (a == b) {
			System.out.println(a);
		} else {// recursive call
			System.out.println(a);
			printAToB(a + 1, b);
		}
	}

	public static void main(String[] args) {
		printAToB(2, 5);
		System.out.println("============");
		printAToB(5, 2);
	}

}

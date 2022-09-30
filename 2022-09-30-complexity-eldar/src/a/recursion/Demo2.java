package a.recursion;

public class Demo2 {

	/**
	 * print all numbers from 1 to val
	 * @param val
	 */
	public static void printOneToVal(int val) {
		if (val == 1) { // base case
			System.out.println(val);
			return;
		}else { // other cases
			printOneToVal(val-1);
			System.out.println(val);
			return;
		}
	}

	public static void main(String[] args) {
		printOneToVal(3);
	}

}

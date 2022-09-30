package a.recursion;

public class Demo6Fibonnaci {

	/**
	 * returns the nth element in Fibonnaci set
	 * 
	 * @param n the index of the element
	 * @return the element int the set
	 */
	public static int fibonnaciRecursive(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonnaciRecursive(n - 1) + fibonnaciRecursive(n - 2);
		}
	}
	public static int fibonnaciNonRecursive(int n) {
		int f1 = 1;
		int f2 = 1;
		for (int i = 2; i < n; i++) {
			int temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}
		return f2;
	}
	
	public static void main(String[] args) {
		long ts1 = System.currentTimeMillis();
		int f = fibonnaciRecursive(40);
//		int f = fibonnaciNonRecursive(40);
		long ts2 = System.currentTimeMillis();
		System.out.println(f);
		System.out.println(ts2-ts1 + " ms");
	}

}

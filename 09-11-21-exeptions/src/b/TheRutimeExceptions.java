package b;

public class TheRutimeExceptions {

	public static void main(String[] args) {

		// ClassCastException
		Object x = new Object();
		String y = (String) x;

		// NumberFormatException
		String str = "45A";
		int age = Integer.parseInt(str);
		System.out.println(age);

		// ArrayIndexOutOfBoundsException
		int[] nums = { 1, 2, 3 };
		System.out.println(nums[100]);

		// NegativeArraySizeException
		int[] arr = new int[-9];

		// NullPointerException
		Object obj = null;
		System.out.println(obj.hashCode());

		// ArithmeticException
		System.out.println(3 / 0);

	}

}

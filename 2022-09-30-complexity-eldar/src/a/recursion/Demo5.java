package a.recursion;

public class Demo5 {

	public static long factorial(long n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1L);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("0! = " + factorial(0));
		System.out.println("1! = " + factorial(1));
		System.out.println("2! = " + factorial(2));
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("100! = " + factorial(100));
	}

}

package a.recursion;

public class Demo3 {

	static int x = 1;

	static void printX() {
		System.out.println(x); // base case
		if (x != 5) {
			x++;
			printX(); // recursive call
		}
	}

	public static void main(String[] args) {
		printX();

	}

}

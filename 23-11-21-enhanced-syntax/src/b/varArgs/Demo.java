package b.varArgs;

public class Demo {

	// method definition
	public static int sum(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static int sum(String userName, int... numbers) {
		System.out.println("hello " + userName);
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	public static void main(String[] args) {
		// method use
		{
			int sumOfNumbers = sum(4, 8, 7);
			System.out.println(sumOfNumbers);
		}

		{
			int sumOfNumbers = sum("Dani", 4, 8, 7);
			System.out.println(sumOfNumbers);
		}

	}

}

package f.random;

public class Demo1 {

	public static void main(String[] args) {

		// 0 - 0.999999
		System.out.println(Math.random());

		// 0.0 - 10.999999
		System.out.println(Math.random() * 11);

		// 0 - 10
		System.out.println((int) (Math.random() * 11));

		// create a random variable in a range 0 - 10
		int r = (int) (Math.random() * 11);
		System.out.println(r);

		// create a random variable in a range 0 - 25
		r = (int) (Math.random() * 26);
		System.out.println(r);

		// create a random variable in a range 0 - 3
		r = (int) (Math.random() * 4);
		System.out.println(r);

		// create a random variable in a range 10 - 20
		r = (int) (Math.random() * 11) + 10;
		System.out.println(r);

		// create a random variable in a range (-5) - (5)
		r = (int) (Math.random() * 11) - 5;
		System.out.println(r);

		System.out.println("=========");
		int a = 5;
		int b = 10;
		int rnd = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(rnd);

	}

}

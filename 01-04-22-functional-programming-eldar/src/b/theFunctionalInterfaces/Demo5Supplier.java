package b.theFunctionalInterfaces;

import java.util.function.Supplier;

import types.Point;

public class Demo5Supplier {

	public static void main(String[] args) {

		// example 1: supplier of integer
		Supplier<Integer> rand1 = () -> (int) (Math.random() * 101);
		Supplier<Integer> rand2 = () -> (int) (Math.random() * 101) + 100;

		int x;

		x = rand1.get();
		System.out.println(x);

		x = rand2.get();
		System.out.println(x);

		// example 2: supplier of Point

		Supplier<Point> zeroPoint = () -> new Point();
		Supplier<Point> randomPoint = () -> new Point(rand1.get(), rand2.get());

		Point p1 = zeroPoint.get();
		Point p2 = randomPoint.get();

		System.out.println(p1);
		System.out.println(p2);

	}

}

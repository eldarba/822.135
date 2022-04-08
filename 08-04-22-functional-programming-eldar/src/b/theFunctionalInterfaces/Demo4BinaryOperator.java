package b.theFunctionalInterfaces;

import java.util.function.BinaryOperator;

import types.Point;

public class Demo4BinaryOperator {

	public static void main(String[] args) {

		// example 1 - integers
		BinaryOperator<Integer> plus = (a, b) -> a + b;

		int a = 4;
		int b = 7;

		int sum = plus.apply(a, b);
		System.out.println(sum);

		// example 2 - points
		BinaryOperator<Point> mid = (p1, p2) -> new Point((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);

		Point p1 = new Point(10, 10);
		Point p2 = new Point(20, 20);
		Point midPoint = mid.apply(p1, p2);
		System.out.println(midPoint);

	}

}

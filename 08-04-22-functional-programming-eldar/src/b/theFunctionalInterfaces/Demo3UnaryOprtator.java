package b.theFunctionalInterfaces;

import java.util.function.UnaryOperator;

import types.Point;

public class Demo3UnaryOprtator {

	public static void main(String[] args) {

		// binary vs unary operators
		int a = 5;
		int b = 3;
		int c = a - b; // binary minus operator
		int d = -a; // unary minus operator

		UnaryOperator<Integer> opNeg = x -> -x;

		int x = 5;

		x = opNeg.apply(x);
		System.out.println(x);

		x = opNeg.apply(x);
		System.out.println(x);

		// ===========================================

		// define the unary operator
		UnaryOperator<Point> moveRight = p -> {
			p.setX(p.getX() + 1);
			return p;
		};

		Point p = new Point();
		System.out.println(p);

		// use the defined unary operator
		p = moveRight.apply(p);
		System.out.println(p);

	}

}

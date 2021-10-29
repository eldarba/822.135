package b;

public class AppPoints {

	public static void main(String[] args) {
		// creating Point using CTOR 1
		Point p1 = new Point(3, 9);
		p1.print();

		// creating Point using CTOR 2
		Point p2 = new Point(3);
		p2.print();

		// creating Point using CTOR 3
		Point p3 = new Point();
		p3.print();

		System.out.println("=== pixels");
		Pixel px1 = new Pixel();
		px1.print();

		px1.moveRight(3);
		px1.print();
		px1.moveRight();
		px1.print();
	}

}

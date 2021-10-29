package a.shapes;

public class AppShapes {

	public static void main(String[] args) {

		Circle c1 = new Circle(Math.random() * 6);
		Circle c2 = new Circle(Math.random() * 6);

		System.out.println("radius: " + c1.getRadius() + ", area: " + c1.getArea());
		System.out.println("radius: " + c2.getRadius() + ", area: " + c2.getArea());

		// use super type reference for general purposes
		Shape shape;
		shape = new Circle(2.3);
		System.out.println(shape.getArea());

		shape = new Rectangle(2, 3);
		System.out.println(shape.getArea());

		printArea(c1);

		Shape[] arr = new Shape[3];
		arr[0] = new Shape();
		arr[1] = new Circle(3);
		arr[2] = new Rectangle(2, 9);

		Object obj;
		obj = "aaa";
		obj = new Circle(6);

	}

	// this method can get Shape, Circle, Rectangle
	public static void printArea(Shape shape) {
		System.out.println("area: " + shape.getArea());
	}

}

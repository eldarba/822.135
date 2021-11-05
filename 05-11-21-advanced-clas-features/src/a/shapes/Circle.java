package a.shapes;

public class Circle extends Shape {

	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}

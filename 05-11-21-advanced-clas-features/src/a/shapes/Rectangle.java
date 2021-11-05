package a.shapes;

public class Rectangle extends Shape {

	private int length;
	private int width;

	@Override
	public double getArea() {
		return length * width;
	}

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		return (length + width) * 2;
	}

}

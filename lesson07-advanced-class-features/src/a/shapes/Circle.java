package a.shapes;

// class
public class Circle extends Shape {

	// attribute
	private double radius;

	// CTOR
	public Circle(double radius) {
		super();
		// set the radius attribute
		this.radius = radius;
		// set the area attribute
		// circleArae = PI * r^2
		// this.area = Math.PI * this.radius * this.radius;
		this.area = Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return this.radius;
	}

}

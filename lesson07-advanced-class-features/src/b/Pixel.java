package b;

public class Pixel extends Point {

	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public Pixel(int val, String color) {
		this(val, val, color);
	}

	public Pixel() {
		super();
		this.color = "black";
	}

// method override - when subclass redefine a super class method
	@Override
	public void print() {
		System.out.println("(" + x + ", " + y + "): " + color);
	}

}

package b;

public class Point {

	protected int x;
	protected int y;

	// CTOR 1
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// CTOR 3
	public Point(int val) {
		this(val, val);
	}

	// CTOR 3
	public Point() {
	}

	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

	// method overload
	public final void moveRight(int steps) {
		this.x += steps;
	}

	// final methods cannot be overridden (by subclass)
	public final void moveRight() {
		moveRight(1);
	}

}

package a;

public class Point {

	private int x;
	private int y;

	public static final int MIN = 0;
	public static final int MAX = 100;

	public Point() {
		this.x = MIN;
		this.y = MIN;
	}

	public Point(int x, int y) throws PointXYException {
		super();
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws PointXYException {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		} else {
			throw new PointXYException("setX failed - value " + x + " is out of range");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws PointXYException {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		} else {
			throw new PointXYException("setY failed - value " + y + " is out of range");
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}

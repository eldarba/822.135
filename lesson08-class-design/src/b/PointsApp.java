package b;

public class PointsApp {

	public static void main(String[] args) {

		Point[] points = new Point[100];

		for (int i = 0; i < points.length; i++) {
			int x = (int) (Math.random() * 51);
			int y = (int) (Math.random() * 51);
			points[i] = new Point(x, y);
			System.out.println(points[i]);
		}

	}

}

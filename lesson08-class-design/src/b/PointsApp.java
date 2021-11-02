package b;

public class PointsApp {

	public static void main(String[] args) {

		// array of 100 Point instances
		Point[] points = new Point[100];

		// populate and print
		for (int i = 0; i < points.length; i++) {
			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);
			points[i] = new Point(x, y);
			System.out.println(i + "] " + points[i]);
		}

		// is there a point identical to the first point
		Point p1 = points[0];
		boolean foundSamePoint = false;
		int index = -1;

		for (int i = 1; i < points.length; i++) {
			if (points[i].equals(p1)) {
				foundSamePoint = true;
				index = i;
				break;
			}
		}

		if (foundSamePoint) {
			System.out.println("found at index " + index);
		} else {
			System.out.println("not found");
		}
	}

}

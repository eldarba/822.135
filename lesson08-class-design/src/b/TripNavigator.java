package b;

public class TripNavigator {

	private Point[] route = new Point[10];
	private int index;

	public void addPoint(Point point) {
		if (index < route.length) {
			route[index] = point;
			index++;
		} else {
			System.out.println("addPoint failed");
		}
	}

	public void displayRoute() {
		System.out.println("START of rout");
		for (int i = 0; i < route.length; i++) {
			if (route[i] != null) {
				System.out.println(route[i]);
			} else {
				break;
			}
		}
		System.out.println("END of rout");
	}

	public boolean isPassingThrough(Point point) {
		boolean passing = false;
		for (int i = 0; i < route.length; i++) {
			if (route[i] != null && route[i].equals(point)) {
				passing = true;
				break;
			}
		}
		return passing;
	}

}

package b;

public class NavigatorTest {

	public static void main(String[] args) {

		TripNavigator nav = new TripNavigator();
		nav.addPoint(new Point(0, 0));
		nav.addPoint(new Point(10, 30));
		nav.addPoint(new Point(50, 90));
		nav.addPoint(new Point(0, 0));
		nav.displayRoute();

		System.out.println(nav.isPassingThrough(new Point(10, 31)));

	}

}

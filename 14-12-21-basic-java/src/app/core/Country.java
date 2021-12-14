package app.core;

public class Country {

	public static final int NUM_OF_HIGWAYS = 5;
	private Highway[] highways = new Highway[NUM_OF_HIGWAYS];

	public Highway[] getHighways() {
		return highways;
	}

	public boolean addHigway(Highway highway) {
		for (int i = 0; i < highways.length; i++) {
			if (highways[i] == null) {
				this.highways[i] = highway;
				return true;
			}
		}
		return false;
	}

	public int getNumberOfCars() {
		int c = 0;
		for (Highway highway : highways) {
			if (highway != null) {
				c += highway.getNumberOfCars();
			}
		}
		return c;
	}

	public String displayHighways() {
		StringBuilder sb = new StringBuilder();
		sb.append("=== Highways ====");
		for (Highway highway : highways) {
			if (highway != null) {
				sb.append("\n").append(highway.toString());
			}
		}
		sb.append("\n");
		return sb.toString();
	}

}

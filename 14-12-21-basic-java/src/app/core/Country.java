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
		sb.append("=== ========== ====");
		sb.append("\n");
		return sb.toString();
	}

	/**
	 * @return the average speed of cars in country or -1 if the country is empty.
	 */
	public double getAvgHighwaySpeed() {
		double sum = 0;
		int c = 0;
		for (Highway highway : highways) {
			if (highway != null) {
				double avg = highway.getAverageCarsSpeed();
				if (avg != -1) {
					c++;
					sum += avg;
				}
			}
		}
		if (c == 0) {
			return -1;
		} else {
			return sum / c;
		}
	}

	/**
	 * @return the max speed of cars in country.
	 */
	public int getMaxSpeed() {
		int max = 0;
		for (Highway highway : highways) {
			if (highway != null && highway.getMaxSpeed() > max) {
				max = highway.getMaxSpeed();
			}
		}
		return max;
	}

	public Highway getMostBusyHighway() {
		Highway theMostBusyHighway = null;
		int max = -1;
		for (Highway highway : highways) {
			if (highway != null && highway.getNumberOfCars() > max) {
				max = highway.getNumberOfCars();
				theMostBusyHighway = highway;
			}
		}
		return theMostBusyHighway;
	}

	public Highway getFastestHighway() {
		Highway fastestHighway = null;
		double max = -1D;
		for (Highway highway : highways) {
			if (highway != null && highway.getAverageCarsSpeed() > max) {
				max = highway.getAverageCarsSpeed();
				fastestHighway = highway;
			}
		}
		return fastestHighway;
	}

}

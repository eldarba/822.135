package app.core;

public class Highway {
	public static final int NUM_OF_CARS = 100;
	private String name;

	private Car[] cars = new Car[NUM_OF_CARS];

	public Highway(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car[] getCars() {
		return cars;
	}

	public boolean addCar(Car car) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				this.cars[i] = car;
				return true;
			}
		}
		return false;
	}

	public int getNumberOfCars() {
		int c = 0;
		for (Car car : cars) {
			if (car != null) {
				c++;
			}
		}
		return c;
	}

	public int getNumberOfFamilyCars() {
		int c = 0;
		for (Car car : cars) {
			if (car != null && car instanceof FamilyCar) {
				c++;
			}
		}
		return c;
	}

	/**
	 * @return the average speed of cars on highway or -1 if the highway is empty.
	 */
	public double getAverageCarsSpeed() {
		double sum = 0;
		int c = 0;
		for (Car car : cars) {
			if (car != null) {
				c++;
				sum += car.getSpeed();
			}
		}
		if (c == 0) {
			return -1;
		} else {
			return sum / c;
		}
	}

	/**
	 * @return the max speed of cars on highway.
	 */
	public int getMaxSpeed() {
		int max = 0;
		for (Car car : cars) {
			if (car != null && car.getSpeed() > max) {
				max = car.getSpeed();
			}
		}
		return max;
	}

	@Override
	public String toString() {
		return "Highway [name=" + name + ", number of cars=" + getNumberOfCars() + ", avgSpeed=" + getAverageCarsSpeed()
				+ "]";
	}

}

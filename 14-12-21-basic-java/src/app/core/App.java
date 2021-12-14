package app.core;

public class App {

	private App() {
	}

	static int nextNumber = 101;
	static int nextHighwayNumber = 50001;

	public static void main(String[] args) {

		Country country = getCountry();
		System.out.println("number of cars in country: " + country.getNumberOfCars());
		System.out.println(country.displayHighways());

	}

	public static Country getCountry() {
		Country country = new Country();
		int n = (int) (Math.random() * Country.NUM_OF_HIGWAYS + 1);
		for (int i = 0; i < n; i++) {
			country.addHigway(getHighway());
		}
		return country;
	}

	public static Highway getHighway() {
		Highway highway = new Highway("H" + nextHighwayNumber++);
		int n = (int) (Math.random() * Highway.NUM_OF_CARS + 1);
		for (int i = 0; i < n; i++) {
			highway.addCar(getCar());
		}
		return highway;
	}

	public static Car getCar() {
		Car car;
		int speed = (int) (Math.random() * 111);
		if (Math.random() < 0.8) {
			car = new FamilyCar(nextNumber++, speed);
		} else {
			car = new SportsCar(nextNumber++, speed);
		}
		return car;
	}

}

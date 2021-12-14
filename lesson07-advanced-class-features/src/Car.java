
public class Car {

	// class initializer (static)
	static {
		System.out.println("Car class loaded");
	}

	// instance initializer (non-static)
	{
		System.out.println("Car instance created");
	}

	// dynamic field
	private int number;
	// static field
	private static int carsMade;

	// CTOR
	public Car(int number) {
		super();
		this.number = number;
		carsMade++;
	}

	// dynamic method
	public int getNumber() {
		return number;
	}

	// static method
	public static int getCarsMade() {
		return carsMade;
	}

}

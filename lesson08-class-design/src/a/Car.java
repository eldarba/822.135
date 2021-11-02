package a;

public class Car {

	private static int counter;
	private int number;
	private int speed;
	private String color;

	static { // static initializer - runs on class load
		System.out.println("class Car loaded");
	}

	{ // initializer - runs on each instantiation
		System.out.println("instance of Car created");
		counter++;
	}

	public Car() {
	}

	public Car(int number, int speed, String color) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car[number=" + number + ", speed=" + speed + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return number * 3 / 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		return this.number == other.number;
	}

}

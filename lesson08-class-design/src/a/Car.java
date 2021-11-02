package a;

public class Car {
	private int number;
	private int speed;
	private String color;

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
		return this.number * 3 / 5;
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

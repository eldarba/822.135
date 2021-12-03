package f.synch;

public class DriverThread extends Thread {

	private Car car;

	public DriverThread(String name, Car car) {
		super(name);
		this.car = car;
	}

	@Override
	public void run() {
		car.drive(500);
	}

}

package f.synch;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		DriverThread yosi = new DriverThread("Yosi", car1);
		DriverThread ruti = new DriverThread("Ruti", car2);
		DriverThread moshe = new DriverThread("Moshe", car1);

		yosi.start();
		ruti.start();
		moshe.start();

	}

}

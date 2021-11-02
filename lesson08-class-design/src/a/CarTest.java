package a;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car(101, 0, "Yellow");
		Car car3 = new Car(101, 60, "Blue");

		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		System.out.println("car1 equals car2? " + car1.equals(car2));
		System.out.println("car1 equals car3? " + car1.equals(car3));
		System.out.println("car2 equals car3? " + car2.equals(car3));

	}

}

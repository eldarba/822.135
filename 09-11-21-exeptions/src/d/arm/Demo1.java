package d.arm;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// ARM = Auto Resource Management
		// try with resources
		// try(RESOURCE){}

		try (Scanner sc = new Scanner(System.in); Car car = new Car();) {

			System.out.println("start of try");

			System.out.println("end of try");
		}

	}

}

class Car implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("closing the car");

	}

}

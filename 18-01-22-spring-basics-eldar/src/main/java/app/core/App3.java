package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;
import app.core.beans.cars.Car;
import app.core.beans.cars.FamilyCar;

public class App3 {

	public static void main(String[] args) {

		System.out.println("start");
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {
			FamilyCar car = ctx.getBean(FamilyCar.class);
			
			System.out.println(car.getModel());
			System.out.println(car.getEngineModel());
			System.out.println(car.getGearModel());
		}
		System.out.println("stop");

	}

}

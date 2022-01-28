package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.zoo.Bird;
import app.core.beans.zoo.Mammal;
import app.core.beans.zoo.Reptile;

public class Application3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

			Zoo zoo = ctx.getBean(Zoo.class);

			zoo.addBird(new Bird("Hawk"));
			zoo.addMammal(new Mammal("Elephant"));
			zoo.addMammal(new Mammal("Dog"));
			zoo.addMammal(new Mammal("Lion"));
			zoo.addBird(new Bird("KiWi"));
			zoo.addBird(new Bird("Ostrich"));
			zoo.addReptile(new Reptile("Onake"));
			zoo.addReptile(new Reptile("Aligator"));

			zoo.printAllAnimals();

		}

	}

}

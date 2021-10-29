package d.animals.tests;

import d.animals.Animal;
import d.animals.Ant;
import d.animals.Bee;
import d.animals.Cat;
import d.animals.Dog;
import d.animals.Hawk;
import d.animals.Ostrich;

public class Test1 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[25];
		// populate the array with random animals
		for (int i = 0; i < animals.length; i++) {
			int r = (int) (Math.random() * 10);
			switch (r) {
			case 0: { // if the case is that r is 0 do the the following
				animals[i] = new Cat();
				break;
			}
			case 1: {
				animals[i] = new Dog();
				break;
			}
			case 2: {
				animals[i] = new Ostrich();
				break;
			}
			case 3: {
				animals[i] = new Hawk();
				break;
			}
			case 4: {
				animals[i] = new Ant();
				break;
			}
			case 5: {
				animals[i] = new Bee();
				break;
			}

			default:
				System.out.println("index " + i + " is empty");

			}

		}

		// iterate over the animals in the array and activate
		for (int i = 0; i < animals.length; i++) {
			System.out.println("index: " + i);
			if (animals[i] != null) {
				animals[i].speak();
				if (animals[i] instanceof Bee) {
					// if we are here it means current is Bee
					// create a Bee reference on the same animal so we can call fly
					Bee bee = (Bee) animals[i];
					bee.fly();
				}
				if (animals[i] instanceof Hawk) {
					Hawk hawk = (Hawk) animals[i];
					hawk.fly();
				}
			} else {
				System.out.println("NULL");
			}
			System.out.println("=============");
		}

	}

}

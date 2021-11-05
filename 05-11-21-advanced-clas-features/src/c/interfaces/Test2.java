package c.interfaces;

import d.animals.Animal;
import d.animals.Ant;
import d.animals.Bat;
import d.animals.Bee;
import d.animals.Cat;
import d.animals.Dog;
import d.animals.Hawk;
import d.animals.Ostrich;

public class Test2 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[250];
		for (int i = 0; i < animals.length; i++) {
			animals[i] = getRandomAnimal();
		}

		for (int i = 0; i < animals.length; i++) {
			System.out.println("======== " + i);
			Animal animal = animals[i];
			if (animal != null) {
				animal.speak();

				if (animal instanceof AdvancedFlyer) {
					AdvancedFlyer af = (AdvancedFlyer) animal;
					af.takeOff();
					af.fly();
					af.navigate();
					af.land();
					af.greet();
					// ((AdvancedFlyer)animals[i]).fly();
				} else {
					if (animal instanceof Flyer) {
						Flyer f = (Flyer) animal;
						f.fly();
						f.greet();
					}
					if (animal instanceof Navigator) {
						Navigator n = (Navigator) animal;
						n.navigate();
					}
				}
			}

		}
	}

	public static Animal getRandomAnimal() {
		Animal animal = null;
		int r = (int) (Math.random() * 7);
		switch (r) {
		case 0:
			animal = new Ant();
			break;
		case 1:
			animal = new Bat();
			break;
		case 2:
			animal = new Bee();
			break;
		case 3:
			animal = new Cat();
			break;
		case 4:
			animal = new Hawk();
			break;
		case 5:
			animal = new Dog();
			break;
		case 6:
			animal = new Ostrich();
			break;
		}
		return animal;
	}
}

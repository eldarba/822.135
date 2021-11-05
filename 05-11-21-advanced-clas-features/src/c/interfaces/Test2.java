package c.interfaces;

import d.animals.Animal;
import d.animals.Ant;
import d.animals.Bat;
import d.animals.Bee;
import d.animals.Dog;
import d.animals.Hawk;
import d.animals.Ostrich;

public class Test2 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Bat();
		animals[1] = new Dog();
		animals[2] = new Bee();
		animals[4] = new Ant();
		animals[7] = new Ostrich();
		animals[9] = new Hawk();

		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if (animal != null) {
				animal.speak();

				if (animal instanceof AdvancedFlyer) {
					AdvancedFlyer af = (AdvancedFlyer) animal;
					af.takeOff();
					af.fly();
					af.navigate();
					af.land();
					// ((AdvancedFlyer)animals[i]).fly();
				} else {
					if (animal instanceof Flyer) {
						Flyer f = (Flyer) animal;
						f.fly();
					}
					if (animal instanceof Navigator) {
						Navigator n = (Navigator) animal;
						n.navigate();
					}
				}
			}

			System.out.println("========");
		}
	}
}

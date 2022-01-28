package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import app.core.beans.zoo.Animal;
import app.core.beans.zoo.Bird;
import app.core.beans.zoo.Mammal;
import app.core.beans.zoo.Reptile;
import app.core.beans.zoo.Zone;

@Component
@Scope("prototype")
public class Zoo {

	@Autowired
	private Zone<Mammal> mammalZone;
	@Autowired
	private Zone<Bird> birdZone;
	@Autowired
	private Zone<Reptile> reptileZone;

	// add mammal to zoo
	public void addMammal(Mammal mammal) {
		this.mammalZone.addAnimal(mammal);
	}

	// add bird to zoo
	public void addBird(Bird bird) {
		this.birdZone.addAnimal(bird);
	}

	// add reptile to zoo
	public void addReptile(Reptile reptile) {
		this.reptileZone.addAnimal(reptile);
	}

	// display mammals
	public void printMammals() {
		System.out.println("======= Mammals");
		for (Animal animal : mammalZone.getAnimals()) {
			System.out.println(animal);
		}
	}

	// display birds
	public void printBirds() {
		System.out.println("======= Birds");
		for (Animal animal : birdZone.getAnimals()) {
			System.out.println(animal);
		}
	}

	// display reptiles
	public void printReptiles() {
		System.out.println("======= Reptiles");
		for (Animal animal : reptileZone.getAnimals()) {
			System.out.println(animal);
		}
	}

	// display all animals
	public void printAllAnimals() {
		System.out.println("====== Zoo Animals ==============");
		printMammals();
		printBirds();
		printReptiles();
		System.out.println("====== =========== ==============");
	}

}

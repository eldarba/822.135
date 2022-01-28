package app.core.beans.zoo;

import java.util.List;

public class Zone<T extends Animal> {

	private List<T> animals;

	public List<T> getAnimals() {
		return animals;
	}

	public void setAnimals(List<T> animals) {
		this.animals = animals;
	}

	public void addAnimal(T animal) {
		this.animals.add(animal);
	}

}

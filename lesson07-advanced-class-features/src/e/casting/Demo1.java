package e.casting;

import d.animals.Animal;
import d.animals.Cat;
import d.animals.Dog;

public class Demo1 {

	public static void main(String[] args) {
		// casting convert types
		// cast operator (type)

		// cast primitives
		int x = 50;
		double y = x; // cast int to double - implicit

		short a = (short) y; // cast double to short - explicit - danger of data loss

		// cast Objects
		Cat cat = new Cat();
		Animal animal = cat; // cast Cat to Animal - implicit

		cat = (Cat) animal; // cast Animal to Cat - explicit - might be an error
		cat.speak();

		System.out.println(animal instanceof Dog);
		System.out.println(animal instanceof Cat);
		Dog dog = (Dog) animal; // error
		dog.speak();

	}

}

package d.inheritance;

public class Test {

	public static void main(String[] args) {
		Animal animal;

		animal = new Animal();
		animal.speak();

		animal = new Dog();
		animal.speak();

		animal = new Cat();
		animal.speak();

		System.out.println("===================");
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof Cat) {
				// convert to cat
				Cat cat = (Cat) animals[i];
				// use cat method
				cat.scratch();
				// ((Cat)animals[i]).scratch();
			}
			System.out.println("------------");
		}

	}

}

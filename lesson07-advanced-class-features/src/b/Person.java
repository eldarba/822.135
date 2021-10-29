package b;

public class Person {

	private int id;
	private String name;
	private int age;

	// CTOR 1
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// CTOR 2
	public Person(int id, String name) {
		this(id, name, 0); // invoke another CTOR in this class
	}

	// CTOR 3
	public Person() {
		super(); // invoke another CTOR in super class
	}

}

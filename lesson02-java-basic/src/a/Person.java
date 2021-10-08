// package is a keyword for package declaration - it is part of the class name
// a.Person is the fully qualified name of this class 
package a;

// public is an access modifier keyword - it means this class is always visible.
// class is a keyword for class declaration
// Person is an identifier (invented by the programmer)
public class Person {

	// attributes - describe the class data
	// private is an access modifier keyword - it means this member is visible from
	// within the class only.
	private int id;
	private String name;
	private int age;

	// constructor - is a special method that runs on object creation.
	// CTORs has no return type
	// CTORs name is the class name
	// CTORs are used for initialization
	public Person() {
		System.out.println("an object is created");
		this.id = -1;
		this.name = "default_name";
		this.age = 18;
	}

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// methods
	// accessors (getters) and mutators (setters)

	// an accessor method for age
	public int getAge() {
		return age;
	}

	// a mutator method for age
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	/**
	 * this method return the id of the person
	 * */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * line 1
	 * line 2
	 * line 3
	 * */
}

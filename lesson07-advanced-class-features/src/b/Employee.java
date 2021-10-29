package b;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age);
		this.salary = salary;
	}

	public Employee(int id, String name, int age) {
		this(id, name, age, 6_500);
	}

}

package targil;

public class Manager extends Employee {

	public Manager() {
		super();
	}

	public Manager(String name, double salary, String department) {
		super(name, salary, department);
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

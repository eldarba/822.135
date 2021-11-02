package c;

public class Employee {

	// class field - belongs to class
	private static int numOfEmps;
	// instance field - belongs to instance
	private int id;

	public Employee() {
		numOfEmps++;
	}

	// class method - belongs to class
	public static int getNumOfEmps() {
		return numOfEmps;
	}

	// instance method - belongs to instance
	public int getId() {
		return id;
	}

}

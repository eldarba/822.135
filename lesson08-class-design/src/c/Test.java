package c;

public class Test {

	public static void main(String[] args) {

		// instance - object
		Employee e1 = new Employee();
		// call instance method using the instance reference
		System.out.println(e1.getId());
		// call class method using the static (class) reference
		System.out.println(Employee.getNumOfEmps());

	}
}

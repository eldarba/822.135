package b;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("start");
		Person p1; // p1 is not initialized (local variable)
		p1 = null; // initialize to null - no address
		p1.getName(); // null pointer exception - null reference
		
		
		p1 = new Person(101, "Dani", 22);
		p1.getName(); // ok - reference is pointing to an object
		System.out.println("stop");
		
		// primitives va references
		int x = 5;
		System.out.println(x);
		System.out.println(p1.getName());

	}

}

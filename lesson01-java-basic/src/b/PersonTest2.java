package b;

public class PersonTest2 {

	public static void main(String[] args) {
		
		int x = 5;
		System.out.println(x);
		
		// 2 objects might have the same type and same state
		Person p1 = new Person(); 
		p1.id = 101;
		p1.name = "David";
		p1.age = 25;
		
		Person p2 = new Person(); 
		p2.id = 101;
		p2.name = "David";
		p2.age = 25;
		

	}

}

package a;

public class App1 {

	public static void main(String[] args) {
		// create an instance of the class person
		Person p1 = new Person();
		
		// using the object - invoking methods
		// calling a method is called invocation
		p1.setId(101);
		p1.setName("Dan");
		p1.setAge(35);
		
		System.out.println(p1.getId()); 
		System.out.println(p1.getName()); 
		System.out.println(p1.getAge()); 

	}

}

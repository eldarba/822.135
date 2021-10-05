package b;

public class PersonTest3 {

	public static void main(String[] args) {
		
		/*
		 * with polymorphism we can access the object with different type of references
		 * on the inheritance hierarchy
		 * */
		Person person; // reference of type Person
		Student student;  // reference of type Student
		
		// both point to the same object (Student)
		student = new Student();
		person = student;
		
		
		
		
		
		

	}

}

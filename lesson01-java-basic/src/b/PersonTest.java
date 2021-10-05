package b;

public class PersonTest {

	public static void main(String[] args) {
		// create an object of type Person
		Person person = new Person(); 
		// set the object values - state
		person.id = 101;
		person.name = "David";
		person.age = 25;
		// print the object state
		System.out.println(person.id);
		System.out.println(person.name);
		System.out.println(person.age);
		
		person.speak("Hello! how are you.");
		

	}

}

package c;


import java.util.Date;

// import declaration allow us to use the short class name (without package)
import a.Person;


public class App {

	public static void main(String[] args) {
		
		// because we have import we do not need to specify package
		Person p1 = new Person(101, "aaa", 36);
		System.out.println(p1.getId());
		
		Date date;

	}

}

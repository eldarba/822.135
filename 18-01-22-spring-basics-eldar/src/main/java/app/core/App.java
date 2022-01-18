package app.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {
		System.out.println("start");
		
		// this is spring container
		// it can manage our beans - application objects
		// it needs configuration
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);){
			// ask the container for an instance of the bean
			Person p1 = ctx.getBean("person", Person.class);
			Person p2 = ctx.getBean("person", Person.class);
			Person p3 = ctx.getBean("person", Person.class);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
			Person siri = ctx.getBean("siri", Person.class);
			System.out.println(siri);
			
			System.out.println("=================");
			List<Person> list = new ArrayList<>();
			for (int i = 0; i < 100; i++) {
				list.add(ctx.getBean("coffeeWorker", Person.class));
			}
			
			for (Person coffeeWorker : list) {
				System.out.println(coffeeWorker);
			}
		}
		
		
		
		System.out.println("end");

	}

}

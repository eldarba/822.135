package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App {

	public static void main(String[] args) {
		
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
		}
		
		
		
		System.out.println("end");

	}

}

package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

//@ComponentScan(basePackages = { "app.core", "app.beans" })
public class Application {

	public static void main(String[] args) {

		System.out.println("start");

		// spring context (in ARM)
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			Person p1 = ctx.getBean("person", Person.class);
			p1.setName("Uzi");
			Person p2 = ctx.getBean("person", Person.class);
			p2.setName("Rina");

			System.out.println(p1);
			System.out.println(p2);

			Person p3 = ctx.getBean("superman", Person.class);
			Person p4 = ctx.getBean("wonderwoman", Person.class);

			System.out.println(p3);
			System.out.println(p4);
		}

		System.out.println("stop");
	}

}

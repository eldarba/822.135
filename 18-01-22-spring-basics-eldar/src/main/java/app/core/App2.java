package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Person;

public class App2 {

	public static void main(String[] args) {

		System.out.println("start");
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class)) {
			// singletons are eagerly created by default
			Person siri = ctx.getBean("siri", Person.class);
			
			System.out.println(ctx.getBean(Integer.class));
			System.out.println(ctx.getBean(Integer.class));
			System.out.println(ctx.getBean(Integer.class));
			System.out.println(ctx.getBean(Integer.class));
		}
		System.out.println("stop");

	}

}

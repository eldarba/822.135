package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.IntegratedCalculator;

//@ComponentScan(basePackages = { "app.core", "app.beans" })
public class Application2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {

			IntegratedCalculator calc = ctx.getBean(IntegratedCalculator.class);
			System.out.println(calc.getClass()); // we get the implementation
			calc.add(5);
			calc.mul(3);
			System.out.println(calc.getRes());

			calc.clear();
			System.out.println(calc.getRes());

			System.out.println(calc.getInMeters(3598));

		}

	}

}

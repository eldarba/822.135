package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.aspects.StatisticalAspect;
import app.core.brokers.Broker;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application3 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application3.class);) {

			Broker broker = ctx.getBean(Broker.class);

			try {
				broker.buyCars((int) (Math.random() * 25 + 10));
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

}

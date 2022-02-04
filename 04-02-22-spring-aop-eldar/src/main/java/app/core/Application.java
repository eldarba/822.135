package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.brokers.Broker;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);) {

			Broker broker = ctx.getBean(Broker.class);

			// buy and sell
			for (int i = 0; i < 3; i++) {
				broker.buyStocks((int) (Math.random() * 5 + 1));
				broker.buyCars((int) (Math.random() * 5 + 1));
				broker.sellStocks((int) (Math.random() * 5 + 1));
				broker.sellCars((int) (Math.random() * 5 + 1));
			}

		}

	}

}

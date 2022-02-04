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
public class Application2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application2.class);) {

			Broker broker = ctx.getBean(Broker.class);

			broker.buyCars(3);
			broker.buyStocks(5);
			broker.sellCars(100);
			broker.buyCars(2);
			
			System.out.println("=================");
			StatisticalAspect stat = ctx.getBean(StatisticalAspect.class);
			System.out.println("total buy: " + stat.getTotalBuy());
		}

	}

}

package app.core.beans.pool;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

	public static void main(String[] args) throws InterruptedException {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class)) {
			System.out.println("spring app started");

			ConnectionPool pool = ctx.getBean(ConnectionPool.class);
			// pool.startThePool();

			// use
			String x = pool.getConnection();
			System.out.println(x);

			TimeUnit.SECONDS.sleep(5);

			// destroy
			// pool.closeThePool();
		}
		System.out.println("spring app stopped");
	}

}

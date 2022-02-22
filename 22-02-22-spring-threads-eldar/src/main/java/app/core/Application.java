package app.core;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) throws InterruptedException {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);) {
			TimeUnit.SECONDS.sleep(10);
		}

		System.out.println("END");
	}

}

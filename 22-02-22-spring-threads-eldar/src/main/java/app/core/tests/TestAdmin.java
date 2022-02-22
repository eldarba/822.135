package app.core.tests;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class TestAdmin implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Admin test started");
		System.out.println("Admin test ended");
	}

}

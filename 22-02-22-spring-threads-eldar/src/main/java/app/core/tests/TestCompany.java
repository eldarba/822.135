package app.core.tests;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TestCompany implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Company test started");
		System.out.println("Company test ended");
	}

}

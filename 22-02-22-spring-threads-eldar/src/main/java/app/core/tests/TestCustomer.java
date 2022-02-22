package app.core.tests;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class TestCustomer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Customer test started");
		System.out.println("Customer test ended");
	}

}

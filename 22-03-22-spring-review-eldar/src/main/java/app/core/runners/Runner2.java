package app.core.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.services.AppService;

@Component
@Order(2)
public class Runner2 implements CommandLineRunner {

	@Autowired
	private AppService appService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("========= runner 2");

		try {
			appService.deletePost(111);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("==================");

	}

}

package app.core.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.services.AppService;
import app.core.services.LoginService;

//@Component
@Order(2)
public class Runner2 implements CommandLineRunner {

	@Autowired
	private AppService appService;
	@Autowired
	private LoginService loginService;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("========= runner 2");

		try {
			loginService.login("admin", "123");
			appService.deletePost(111);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("==================");

	}

}

package app.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLoginController {
	
	private String password = "admin";
	private boolean loggedIn;
	
	@GetMapping("/login/{password}")
	public boolean login(@PathVariable String password) {
		return this.loggedIn = password.equals(this.password);
	}

	public boolean isLoggedIn() {
		return loggedIn;
	} 
	
	

}
 
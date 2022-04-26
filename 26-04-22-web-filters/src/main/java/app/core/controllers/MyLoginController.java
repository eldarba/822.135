package app.core.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLoginController {
	
	private String password = "admin";
	private boolean loggedIn;
	
	@PutMapping("/login/{password}")
	public boolean login(@PathVariable String password) {
		return this.loggedIn = password.equals(this.password);
	}
	@PutMapping("/logout")
	public void logout() {
		this.loggedIn=false;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	} 
	
	

}
 
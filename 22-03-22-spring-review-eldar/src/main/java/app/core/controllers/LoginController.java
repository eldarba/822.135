package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	// htpp://localhost:8080/login/admin/123
	@PutMapping("/login/{user}/{password}")
	public boolean login(@PathVariable String user, @PathVariable String password) {
		return loginService.login(user, password);
	}

	@PutMapping("/logout")
	public void logout() {
		loginService.logout();
	}

}

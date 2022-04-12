package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.util.JwtUtil;
import app.core.util.JwtUtil.Client;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private JwtUtil jwtUtil;

	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		try {
			Client client = jwtUtil.extractClient(token);
			return "Hello " + client.getEmail();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "you are not logged in");
		}
	}

}

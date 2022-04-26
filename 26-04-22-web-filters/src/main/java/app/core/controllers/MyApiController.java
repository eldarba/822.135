package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class MyApiController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello from Admin API";
	}

}
 
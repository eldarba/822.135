package app.core.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/my-controller")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class MyController {

	@GetMapping("/greet")
	public String greet() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (Math.random() < 0.5) {
			return "Hello from my controller";
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "bad luck");
		}
	}

}

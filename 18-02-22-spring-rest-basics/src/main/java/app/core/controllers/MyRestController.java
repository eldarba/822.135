package app.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	// http://localhost:8080/greet
	@RequestMapping(method = RequestMethod.GET, path = "/greet")
	public String greet() {
		if (Math.random() < 0.5) {
			throw new RuntimeException("error aaa bbb");
		}
		return "Hello RESTfull World";
	}

	// a method that gets 2 numbers and return sum
	@RequestMapping(method = RequestMethod.GET, path = "/sum")
	public int sum(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

	// a method that gets 2 numbers and return sum
	@RequestMapping(method = RequestMethod.GET, path = "/sum2")
	public String sum2(@RequestParam int a, @RequestParam int b) {
		return a + " + " + b + " = " + (a + b);
	}

}

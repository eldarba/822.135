package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/my-controller")
public class MyController {

	@GetMapping
	public String greet() {
		return "Hello " + Math.random();
	}

	@GetMapping("/person")
	public Person getPerson() {
		Person p = new Person(101, "David", 25);
		return p;
	}

	@Data
	@AllArgsConstructor
	public static class Person {
		private int id;
		private String name;
		private int age;
	}

}

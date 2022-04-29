package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

	private List<Person> list = new ArrayList<>();

	@PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void addPerson(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
		Person p = new Person(id, name, age);
		list.add(p);
		System.out.println(list);
	}

	@GetMapping
	public Person getPerson(@RequestParam int id) {
		for (Person person : list) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

}

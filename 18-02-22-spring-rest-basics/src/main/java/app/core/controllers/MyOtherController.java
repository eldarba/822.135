package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numbers")
public class MyOtherController {

	private List<Integer> list = new ArrayList<>();

	@PostMapping
	public void add(@RequestParam int val) {
		list.add(val);
	}

	@GetMapping
	public int get(@RequestParam int index) {
		return index < list.size() ? list.get(index) : -1;
	}

	// http://localhost:8080/api/numbers/dani
	@GetMapping("/{user}")
	public String greet(@PathVariable String user) {
		return "hello " + user;
	}

}

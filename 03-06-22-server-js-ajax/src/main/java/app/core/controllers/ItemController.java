package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.beans.Item;

@RestController
@CrossOrigin
@RequestMapping("/api/items")
public class ItemController {

	private int id;
	private List<Item> items = new ArrayList<>();

	@PostMapping
	public int create(@RequestBody Item item) {
		item.setId(++id);
		this.items.add(item);
		return item.getId();
	}

	@GetMapping("/{itemId}")
	public Item getItem(@PathVariable int itemId) {
		Item item = new Item();
		item.setId(itemId);
		int index = items.indexOf(item);
		if (index != -1) {
			return items.get(index);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "for id " + itemId);
		}
	}

}

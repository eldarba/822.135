package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.beans.Item;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "http://127.0.0.1:5500") // add CORS headers to the response
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
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item with id: " + itemId + " not found");
		}
	}
	
	@GetMapping
	public List<Item> getAllItems(){
		return this.items;
	}
	
	@PutMapping
	public void updateItem(@RequestBody Item item) {
		Item itemFromDb = this.getItem(item.getId());
		itemFromDb.setName(item.getName());
		itemFromDb.setPrice(item.getPrice());
	}
	
	@DeleteMapping("/{itemId}")
	public void deleteItem(@PathVariable int itemId) {
		this.items.remove(this.getItem(itemId));
	}
	
	@DeleteMapping
	public void deleteAll() {
		this.items.clear();
	}

}

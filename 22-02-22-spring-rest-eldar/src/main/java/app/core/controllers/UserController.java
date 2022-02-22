package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private int nextId = 101;

	private List<User> users = new ArrayList<>();

//	POST - create new resource on the server
	// MIME type
//	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@PostMapping
	public int addUser(@RequestBody User user) {
		user.setId(nextId++);
		this.users.add(user);
		System.out.println(users);
		return user.getId();
	}

//	GET - get an existing resource from the server
	@GetMapping("/{userId}")
	public ResponseEntity<?> getUser(@PathVariable int userId) {
		User user = new User();
		user.setId(userId);
		int index = users.indexOf(user);
		if (index != -1) {
			user = users.get(index);
			return ResponseEntity.ok(user); // response status 200 OK + body with user
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("getUser faild - not found");
			// ???
			// throw new RuntimeException("getUser faild - not found");
		}
	}

	@GetMapping
	public List<User> getAllUsers() {
		return this.users;
	}

//	UPDATE - update an existing resource on the server
	@PutMapping
	public ResponseEntity<Void> updateUser(@RequestBody User user) {
		int index = users.indexOf(user);
		if (index != -1) {
			User oldUser = users.get(index);
			oldUser.setEmail(user.getEmail());
			oldUser.setName(user.getName());
			System.out.println(users);
			// return new ResponseEntity<>(HttpStatus.OK);
			return ResponseEntity.status(HttpStatus.OK).build();
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

//	DELETE - delete an existing resource from the server
	@DeleteMapping("/{userId}")
	public boolean delete(@PathVariable int userId) {
		return users.remove(new User(userId, null, null));
	}

}

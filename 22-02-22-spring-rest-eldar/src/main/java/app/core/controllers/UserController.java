package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.User;

@RestController
public class UserController {

	private int nextId = 101;

	private List<User> users = new ArrayList<>();

//	POST - create new resource on the server
	// MIME type
	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public int addUser(@RequestBody User user) {
		user.setId(nextId++);
		this.users.add(user);
		System.out.println(users);
		return user.getId();
	}

//	GET - get an existing resource from the server
	public User getUser(int userId) {
		return null;
	}
//	UPDATE - update an existing resource on the server
//	DELTE - delete an existing resource from the server

}

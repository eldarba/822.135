package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.services.BookAndLibraryService;

@RestController
@RequestMapping("/api/lib")
public class BookAndLibrarController {

	@Autowired
	private BookAndLibraryService service;

	@PostMapping
	public int addLibrary(@RequestBody Library library) {
		try {
			return this.service.addLibrary(library);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@PostMapping("/{libraryId}")
	public int addBook(@RequestBody Book book, @PathVariable int libraryId) {
		try {
			return this.service.addBookToLibrary(book, libraryId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
}

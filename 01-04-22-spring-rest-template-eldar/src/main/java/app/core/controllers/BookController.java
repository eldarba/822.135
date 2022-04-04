package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Book;
import app.core.services.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping
	public int addBook(@RequestBody Book book) {
		try {
			return this.bookService.addBook(book);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@GetMapping("/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		try {
			return this.bookService.getBook(bookId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@GetMapping
	public List<Book> getAllBook() {
		try {
			return this.bookService.getAllBooks();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

	@PutMapping
	public void updateBook(@RequestBody Book book) {
		try {
			this.bookService.updateBook(book);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping("/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		try {
			this.bookService.deleteBook(bookId);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@DeleteMapping
	public void deleteAllBooks() {
		try {
			this.bookService.deleteAllBooks();
			;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}

}

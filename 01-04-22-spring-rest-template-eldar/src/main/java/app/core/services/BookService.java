package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
import app.core.repos.BookRepo;

@Service
@Transactional
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	// CREAT
	public int addBook(Book book) {
		if (!this.bookRepo.existsById(book.getId())) {
			return this.bookRepo.save(book).getId();
		} else {
			throw new RuntimeException("addBook failed - book already exists");
		}
	}

	// READ
	public Book getBook(int bookId) {
		Optional<Book> opt = this.bookRepo.findById(bookId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new RuntimeException("getBook failed - book not found: " + bookId);
		}
	}

	// READ ALL
	public List<Book> getAllBooks() {
		return this.bookRepo.findAll();
	}

	// UPDATE
	public void updateBook(Book book) {
		Optional<Book> opt = this.bookRepo.findById(book.getId());
		if (opt.isPresent()) {
			this.bookRepo.save(book);
		} else {
			throw new RuntimeException("updateBook failed - book not found: " + book.getId());
		}

	}

	// DELETE
	public void deleteBook(int bookId) {
		if (this.bookRepo.existsById(bookId)) {
			this.bookRepo.deleteById(bookId);
		} else {
			throw new RuntimeException("deleteBook failed - book not found: " + bookId);
		}
	}

	// DELETE ALL
	public void deleteAllBooks() {
		this.bookRepo.deleteAll();
	}

}

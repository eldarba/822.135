package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Book;
import app.core.entities.Library;
import app.core.repos.BookRepo;
import app.core.repos.LibraryRepo;

@Service
@Transactional
public class BookAndLibraryService {

	@Autowired
	private BookRepo bookRepo;
	@Autowired
	private LibraryRepo libraryRepo;

	public int addLibrary(Library library) {
		return libraryRepo.save(library).getId();
	}

	public Library getLibrary(int libraryId) {
		return this.libraryRepo.findById(libraryId).orElseThrow();
	}

	public void upadteLibrary(Library library) {
		if (libraryRepo.existsById(library.getId())) {
			libraryRepo.save(library);
		} else {
			throw new RuntimeException("upadteLibrary failed: not found");
		}
	}

	public void deleteLibrary(int libraryId) {
		if (libraryRepo.existsById(libraryId)) {
			this.libraryRepo.deleteById(libraryId);
		} else {
			throw new RuntimeException("deleteLibrary failed: not found");
		}
	}

	public int addBookToLibrary(Book book, int libraryId) {
		Library library = getLibrary(libraryId);
		library.addBook(book);
		return book.getId();
	}

	public Book getBook(int bookId) {
		return this.bookRepo.findById(bookId).orElseThrow();
	}

	public void upadteBook(Book book) {
		if (bookRepo.existsById(book.getId())) {
			bookRepo.save(book);
		} else {
			throw new RuntimeException("upadteBook failed: not found");
		}
	}

	public void deleteBook(int bookId) {
		if (bookRepo.existsById(bookId)) {
			this.bookRepo.deleteById(bookId);
		} else {
			throw new RuntimeException("deleteBook failed: not found");
		}
	}

	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	public List<Book> getAllLibraryBooks(int libraryId) {
		return bookRepo.findAllByLibraryId(libraryId);
	}

}

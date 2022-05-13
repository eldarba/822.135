package app.core.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Book;

public class LibraryClient {

	public static void main(String[] args) {
		System.out.println("client app");
		// from this app we sent requests to server

		RestTemplate rt = new RestTemplate();

		String baseUri = "http://localhost:8080/api/lib";

		// get a library
//		Library library = rt.getForObject(baseUri + "/1", Library.class);
//		System.out.println(library);

		// add a library
//		Library library = new Library(0, "Hifa Library", "Hifa City", null);
//		int id = rt.postForObject(baseUri, library, Integer.class);
//		System.out.println("library added: " + id);

		// add book to a library
//		Book book = new Book(0, "234", "Rest API", "Noam", LocalDate.of(2010, 05, 18), null);
//		int id = rt.postForObject(baseUri + "/3", book, Integer.class);
//		System.out.println("book added: " + id + " to library 3");

		// get all books of library 3
		// to get many entities use an array
		Book[] books = rt.getForObject(baseUri + "/lib-books/3", Book[].class);
		List<Book> bookList = Arrays.asList(books);
		System.out.println(bookList);

	}

}

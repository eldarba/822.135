package app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class RestTemplate1 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String baseUri = "http://localhost:8080/api/book";
		String dictionaryUrl = "https://api.dictionaryapi.dev/api/v2/entries/en_US";

//		{ // CREAT - POST - add book
//			try {
//				Book book = new Book(0, "aaa", "aaa", LocalDate.of(1980, 01, 01));
//				ResponseEntity<Integer> response = rt.postForEntity(baseUri, book, Integer.class);
//				System.out.println("status: " + response.getStatusCode());
//				System.out.println("body: " + response.getBody());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

		// get from google
//		String google = rt.getForObject("https://www.google.com", String.class);
//		System.out.println(google);

		// DICTIONARY
//		ArrayList resp = rt.getForObject(dictionaryUrl + "/dog", ArrayList.class);
//		Map<?, ?> map = (Map<?, ?>) resp.get(0);
//
//		for (Object key : map.keySet()) {
//			System.out.println(key + ": " + map.get(key));
//		}

//		{ // READ - GET - get a book
//			try {
//				Book book = rt.getForObject(baseUri + "/1", Book.class);
//				System.out.println(book);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

//		{ // READ - GET - get all book
//			try {
//				Book[] books = rt.getForObject(baseUri, Book[].class);
////				System.out.println(Arrays.toString(books));
//				// we can convert an array to list
//				List<Book> list = Arrays.asList(books);
//				for (Book book : list) {
//					System.out.println(book);
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

//		{ // update
//			try {
//				Book book = new Book(3, "bbb", "bbb", LocalDate.of(1985, 01, 01));
//				rt.put(baseUri, book);
//				System.out.println(book + " updated");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

//		{ // delete
//			try {
//				rt.delete(baseUri + "/3");
//				System.out.println("deleted");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

//		{ // delete all
//			try {
//				rt.delete(baseUri);
//				System.out.println("deleted all");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

	}

}

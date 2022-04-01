package app.core;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplate1 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String baseUri = "http://localhost:8080/api/book";

		{ // CREAT - POST - add book
			try {
				Book book = new Book(0, "aaa", "aaa", LocalDate.of(1980, 01, 01));
				ResponseEntity<Integer> response = rt.postForEntity(baseUri, book, Integer.class);
				System.out.println("status: " + response.getStatusCode());
				System.out.println("body: " + response.getBody());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

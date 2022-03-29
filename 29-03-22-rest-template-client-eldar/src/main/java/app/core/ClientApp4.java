package app.core;

import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ClientApp4 {

	public static void main(String[] args) {

		System.out.println("====  Client ====");

		// with RestTemplate object we can make http requests
		RestTemplate rt = new RestTemplate();

		// set the url
		String url = "http://localhost:8080/my-controller/person";

		// make a GET request and get a ResponseEntity
		Person responseBody = rt.getForObject(url, Person.class);

		System.out.println(responseBody);

	}

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public static class Person {
		private int id;
		private String name;
		private int age;
	}

}

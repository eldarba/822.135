package app.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientApp2 {

	public static void main(String[] args) {

		System.out.println("====  Client ====");

		// with RestTemplate object we can make http requests
		RestTemplate rt = new RestTemplate();

		// set the url
		String url = "http://localhost:8080/my-controller";

		// make a GET request and get a ResponseEntity
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		// get the response body
		String body = response.getBody();
		System.out.println(body);

		HttpStatus status = response.getStatusCode();
		System.out.println(status);

	}

}

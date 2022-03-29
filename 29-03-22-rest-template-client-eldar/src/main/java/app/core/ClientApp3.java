package app.core;

import org.springframework.web.client.RestTemplate;

public class ClientApp3 {

	public static void main(String[] args) {

		System.out.println("====  Client ====");

		// with RestTemplate object we can make http requests
		RestTemplate rt = new RestTemplate();

		// set the url
		String url = "http://localhost:8080/my-controller";

		// make a GET request and get a ResponseEntity
		String responseBody = rt.getForObject(url, String.class);

		System.out.println(responseBody);

	}

}

package app.core;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientApp1 {

	public static void main(String[] args) {

		System.out.println("====  Client ====");

		// with RestTemplate object we can make http requests
		RestTemplate rt = new RestTemplate();

		// set the url
		String url = "http://localhost:8080/my-controller";

		// set the request
		RequestEntity<?> request = RequestEntity.get(url).build();
		// make the request and get the response
		ResponseEntity<String> response = rt.exchange(request, String.class);

		String body = response.getBody();
		System.out.println(body);

	}

}

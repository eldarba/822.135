package app.core.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Store {
	
	@Value("${store.address}")
	private String address;

	
	
}

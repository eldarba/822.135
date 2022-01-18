package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;

@ComponentScan
@Configuration
public class Config {

	private int nextId = 101;
	private String[] names = { "Danni", "Lea", "Yosi" };

	// bean method - allows us more bean definitions
	
	@Bean
	@Scope("prototype")
	public Person coffeeWorker() {
		Person person = new Person();
		person.setId(nextId++);
		person.setName(names[(int) (Math.random() * names.length)]);
		person.setAge((int) (Math.random() * (30 - 18) + 18));
		return person;
	}

	@Bean
	public Person siri() {
		Person person = new Person();
		person.setId(-1);
		person.setName("Siri");
		person.setAge(25);
		return person;
	}


}

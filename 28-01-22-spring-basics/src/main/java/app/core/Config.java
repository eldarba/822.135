package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.beans.Person;

@Configuration
@ComponentScan
public class Config {

	@Bean
	public Person superman() {
		Person p = new Person();
		p.setId(1);
		p.setName("superman");
		p.setAge(1500);
		return p;

	}

	@Bean
	public Person wonderwoman() {
		Person p = new Person();
		p.setId(1);
		p.setName("wonderwoman");
		p.setAge(1500);
		return p;
	}

}

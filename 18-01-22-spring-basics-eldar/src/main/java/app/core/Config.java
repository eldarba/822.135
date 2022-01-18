package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;
import app.core.beans.cars.Engine;
import app.core.beans.cars.Gear;

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
	@Lazy
	public Person siri() {
		Person person = new Person();
		person.setId(-1);
		person.setName("Siri");
		person.setAge(25);
		return person;
	}

	@Bean
	@Scope("prototype")
	public Integer rand() {
		return (int) (Math.random() * 101);
	}

	@Bean
	@Primary
	@Scope("prototype")
	public Engine standardEngine() {
		Engine engine = new Engine();
		engine.setModel("standard-engine");
		return engine;
	}

	@Bean
	@Scope("prototype")
	public Engine turboEngine() {
		Engine engine = new Engine();
		engine.setModel("turbo-engine");
		return engine;
	}

	@Bean
	@Scope("prototype")
	public Gear regularGear() {
		Gear gear = new Gear();
		gear.setModel("regular-gear");
		return gear;
	}

	@Bean
	@Scope("prototype")
	public Gear automaticGear() {
		Gear gear = new Gear();
		gear.setModel("automatic-gear");
		return gear;
	}

}

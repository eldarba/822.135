package app.core;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;
import app.core.beans.zoo.Bird;
import app.core.beans.zoo.Mammal;
import app.core.beans.zoo.Reptile;
import app.core.beans.zoo.Zone;

@Configuration
@ComponentScan
public class Config {

	@Bean
	@Scope("prototype")
	public Zone<Mammal> mammalZone() {
		Zone<Mammal> zone = new Zone<>();
		zone.setAnimals(new ArrayList<>());
		return zone;
	}

	@Bean
	@Scope("prototype")
	public Zone<Bird> birdZone() {
		Zone<Bird> zone = new Zone<>();
		zone.setAnimals(new ArrayList<>());
		return zone;
	}

	@Bean
	@Scope("prototype")
	public Zone<Reptile> reptileZone() {
		Zone<Reptile> zone = new Zone<>();
		zone.setAnimals(new ArrayList<>());
		return zone;
	}

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

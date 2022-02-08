package app.core.daos;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.entities.Person;

@Component
@Transactional
public class PersonDao {
	
	@Autowired
	private EntityManager em;
	
	// CREATE
	public int create(Person person) {
		em.persist(person);
		return person.getId();
	}
	
	// READ
	public Person read(int id) {
		Person p = em.find(Person.class, id);
		return p;
	}
	
	// UPDATE
	public void update(Person person) {
		// personFromDb is persitent
		// changing state of persistent entities changes the database
		Person personFromDb = read(person.getId());
		personFromDb.setAge(person.getAge());
		personFromDb.setName(person.getName());
	}
	
	// DELETE
	public void delete(int id) {
		Person p = read(id);
		em.remove(p);
	}

}

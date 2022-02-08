package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Person;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(Application.class, args);
		
		// create an entity object to save in the database
		Person person = new Person(0, "Dan", 33);
		
		// entity manager factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		
		// entity manager
		EntityManager em = factory.createEntityManager();
		try {
			// start transaction
			em.getTransaction().begin();
			// save the entity
			em.persist(person);
			// end transaction - commit
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			// end transaction - rollback
			em.getTransaction().rollback();
		}
	}

}

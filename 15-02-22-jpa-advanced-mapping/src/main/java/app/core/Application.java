package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.School;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		try {
			// start transaction
			em.getTransaction().begin();
			School school = new School(0, "Arava", School.Category.ARTS, null);
			school.setAddress(new Address(0, "Israel", "Beer Sheva", "Negev", "bet haarava 3"));
			em.persist(school);
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		}
		
		
	}

	
}

package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.Principal;
import app.core.entities.Review;
import app.core.entities.School;

@SpringBootApplication
public class Application4 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application4.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		try {
			// start transaction
			em.getTransaction().begin();
			// find schools
			School sc1 = em.find(School.class, 4);
			School sc2 = em.find(School.class, 5);
			// create reviews for the schools
			Review r1 = new Review(0, 10, "great", sc1);
			Review r2 = new Review(0, 8, "ok", sc1);
			Review r3 = new Review(0, 4, "bad", sc2);
			Review r4 = new Review(0, 7, "nice", sc2);
			Review r5 = new Review(0, 10, "great", sc2);
			
			Review[] arr = {r1, r2, r3, r4, r5 };
			for (Review review : arr) {
				em.persist(review);
			}
//			
			
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		}
		
		
	}

	
}

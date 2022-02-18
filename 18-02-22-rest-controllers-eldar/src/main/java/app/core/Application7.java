package app.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.Principal;
import app.core.entities.Review;
import app.core.entities.School;
import app.core.entities.Student;

@SpringBootApplication
public class Application7 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application7.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		School school = null;
		try {
			// start transaction
			em.getTransaction().begin();
			// find schools
			school = em.find(School.class, 5);
			System.out.println(school);
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		}
		
		em.close();
		
		System.out.println("=========================");
		System.out.println(school);
		System.out.println(school.getStudents());
		
		
	}

	
}

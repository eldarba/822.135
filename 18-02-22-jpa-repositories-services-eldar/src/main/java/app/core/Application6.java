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
public class Application6 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application6.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		try {
			// start transaction
			em.getTransaction().begin();
			// find schools
			School school = em.find(School.class, 5);
			System.out.println(school);
			List<Student> students = school.getStudents();
			System.out.println("===========");
			for (Student student : students) {
				System.out.println(student);
			}
			System.out.println("===========");
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		}
		
		
		
	}

	
}

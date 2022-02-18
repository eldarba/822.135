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
import app.core.entities.Student;

@SpringBootApplication
public class Application5 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application5.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		try {
			// start transaction
			em.getTransaction().begin();
			// find schools
			School sc1 = em.find(School.class, 4);
			School sc2 = em.find(School.class, 5);
			// create students
			Student st1 = new Student(0, "aaa", null);
			Student st2 = new Student(0, "bbb", null);
			Student st3 = new Student(0, "ccc", null);
			Student st4 = new Student(0, "ddd", null);
			Student st5 = new Student(0, "eee", null);
			// add students to schools
			sc1.addStudents(st1, st2);
			sc2.addStudents(st3, st4, st5);
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		}
		
		
	}

	
}

package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.School;
import app.core.entities.Teacher;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application2.class, args);
		
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		try {
			// start transaction
			em.getTransaction().begin();
			School school = em.find(School.class, 4);
			System.out.println(school);
			System.out.println(school.getAddress());
//			school.getAddress().setStreet("aaa");
//			em.remove(school);
			
			// add teachers
			Teacher t1 = new Teacher(0, "aaa", "aaa");
			Teacher t2 = new Teacher(0, "bbb", "bbb");
			Teacher t3 = new Teacher(0, "ccc", "ccc");
			school.addTeacher(t1);
			school.addTeacher(t2);
			school.addTeacher(t3);
			
			// end transaction
			em.getTransaction().commit();
		} catch (Exception e) {
			// end transaction
			em.getTransaction().rollback();
		} 
		
		
	}

	
}

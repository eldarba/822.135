package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.Teacher;

@SpringBootApplication
public class Application8 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application8.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();
		
		Teacher teacher1 = new Teacher(0, "Meir", "Java");
		Teacher teacher2 = new Teacher(0, "Dina", "Physics");
		
		Student st1 = new Student(0, "aaa", null);
		Student st2 = new Student(0, "bbb", null);
		Student st3 = new Student(0, "ccc", null);
		Student st4 = new Student(0, "ddd", null);
		Student st5 = new Student(0, "eee", null);
		
		// connect teachers and students
		teacher1.addStudent(st1);
		teacher1.addStudent(st2);
		teacher1.addStudent(st3);
		
		teacher2.addStudent(st4);
		teacher2.addStudent(st5);
		
		try {
			em.getTransaction().begin();
			// save the students
//			em.persist(st1);
//			em.persist(st2);
//			em.persist(st3);
//			em.persist(st4);
//			em.persist(st5);
			
			// save the teachers
//			em.persist(teacher1);
//			em.persist(teacher2);

			// save the teachers with loop
			Teacher[] arr = {teacher1, teacher2};
			for (Teacher teacher : arr) {
				em.persist(teacher);
			}
			
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
			em.close();
		}


	}

}

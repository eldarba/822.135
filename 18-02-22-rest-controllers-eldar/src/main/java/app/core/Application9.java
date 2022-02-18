package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.School;
import app.core.entities.School.Category;
import app.core.entities.Student;
import app.core.entities.Teacher;

@SpringBootApplication
public class Application9 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application9.class, args);

		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		Teacher teacher1 = new Teacher(0, "Yosef", "Java");
		Teacher teacher2 = new Teacher(0, "Zehava", "Physics");

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

		Address address = new Address(0, "Israel", "Jerusalem", "center", "herzel");
		School school = new School(0, "JBT", Category.PRIVATE, address);
		school.addTeacher(teacher1);
		school.addTeacher(teacher2);

		try {
			em.getTransaction().begin();
			em.persist(school);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}

}

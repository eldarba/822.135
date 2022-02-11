package app.core;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.School;
import app.core.entities.Student;
import app.core.repos.SchoolRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		SchoolRepo schoolRepo = ctx.getBean(SchoolRepo.class);
		
		School school = new School(0, "Talma Yalin", null);
		school.addStudent(new Student(0, "Yosef", LocalDate.now(), true));
		school.addStudent(new Student(0, "Danna", LocalDate.now(), true));
		school.addStudent(new Student(0, "Lea", LocalDate.now(), false));
		
		schoolRepo.save(school);
	}

}

package app.core;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.School;
import app.core.entities.Student;
import app.core.repos.SchoolRepo;
import app.core.repos.StudentRepo;

@SpringBootApplication
public class Application2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application2.class, args);
		
		SchoolRepo schoolRepo = ctx.getBean(SchoolRepo.class);
		StudentRepo studentRepo = ctx.getBean(StudentRepo.class);
		
		School school = schoolRepo.findById(1).get();
		System.out.println(school);
//		System.out.println(school.getStudents());
		List<Student> students = studentRepo.getAllStudentBySchoolId(school.getId());
		for (Student student : students) {
			System.out.println(student);
		}
	}

}

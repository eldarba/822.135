package tests;

import java.time.LocalDate;

import app.core.beans.Student;
import app.core.exceptions.UniversityException;
import app.core.facades.UniversityFacade;

public class Test2 {

	public static void main(String[] args) {
		UniversityFacade facade = new UniversityFacade();
		try {
			// add 5 students
//			for (int i = 0; i < 5; i++) {
//				int id = facade.addStudent(getActiveRandomStudent());
//				System.out.println("added " + id);
//			}

			// set inactice
//			Student st1 = facade.findStudent(2);
//			Student st2 = facade.findStudent(4);
//			st1.setActive(false);
//			st2.setActive(false);
//			facade.updateStudent(st1);
//			facade.updateStudent(st2);

			// delete students
			facade.deleteStudent(2);
			facade.deleteStudent(4);

			System.out.println("DONE");
		} catch (UniversityException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	public static Student getRandomStudent() {
		String[] names = { "Dan", "Ron", "Zila", "Gila", "Danna", "Asher", "Meir" };
		String name = names[(int) (Math.random() * 100) % names.length];
		LocalDate enrol = LocalDate.now().plusDays((long) (Math.random() * 200) - 100);
		boolean active = Math.random() < 0.5;
		Student student = new Student(name, enrol, active);
		return student;
	}

	public static Student getActiveRandomStudent() {
		Student st = getRandomStudent();
		st.setActive(true);
		return st;
	}
}

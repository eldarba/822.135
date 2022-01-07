package tests;

import java.time.LocalDate;

import app.core.beans.Student;
import app.core.dao.StudentDao;
import app.core.exceptions.UniversityException;

public class Test1 {

	static StudentDao studentDao = new StudentDao();

	public static void main(String[] args) {

		try {
//			addStudent();
//			find(2);
//			findAll();
//			update(1);
			delete(1);
		} catch (UniversityException e) {
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}

	public static void delete(int id) throws UniversityException {
		if (studentDao.delete(id)) {
			System.out.println("deleted: " + id);
		} else {
			System.out.println("NOT deleted - not found: " + id);
		}
	}

	public static void update(int id) throws UniversityException {
		Student student = new Student(id, "AAA", LocalDate.of(1900, 1, 1), false);
		studentDao.update(student);
		System.out.println("updated " + id);
	}

	public static void findAll() throws UniversityException {
		System.out.println("=== students ===========");
		for (Student st : studentDao.findAll()) {
			System.out.println(st);
		}
		System.out.println("=== ======== ===========");
	}

	public static void find(int id) throws UniversityException {
		System.out.println(studentDao.findById(id));
	}

	public static void addStudent() throws UniversityException {
		int id = studentDao.create(new Student("Haim", LocalDate.of(2018, 1, 1), true));
		System.out.println("created: " + id);
	}

}

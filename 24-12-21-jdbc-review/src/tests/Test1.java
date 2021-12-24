package tests;

import java.time.LocalDate;

import app.core.beans.Student;
import app.core.dao.StudentDao;
import app.core.exceptions.UniversityException;

public class Test1 {

	public static void main(String[] args) {

		try {
			StudentDao studentDao = new StudentDao();
			int id = studentDao.create(new Student("Danna", LocalDate.of(2019, 1, 1), false));
			System.out.println("created: " + id);
		} catch (UniversityException e) {
			e.printStackTrace();
		}

	}

}

package app.core.facades;

import app.core.beans.Student;
import app.core.dao.StudentDao;
import app.core.exceptions.UniversityException;

public class UniversityFacade {

	private StudentDao studentDao = new StudentDao();

	public int addStudent(Student student) throws UniversityException {
		return studentDao.create(student);
	}

	public boolean deleteStudent(int studentId) throws UniversityException {
		Student st = studentDao.findById(studentId);
		if (st.isActive()) {
			throw new UniversityException("cannot delete active students");
		}
		return studentDao.delete(studentId);
	}

}

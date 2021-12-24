package app.core.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import app.core.beans.Student;
import app.core.exceptions.UniversityException;

public class StudentDao implements Dao<Student, Integer> {

	@Override
	public Integer create(Student student) throws UniversityException {
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);) {
			String sql = "insert into student values(0,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, student.getName());
			pstmt.setDate(2, Date.valueOf(student.getEnrollDate()));
			pstmt.setBoolean(3, student.isActive());
			pstmt.executeUpdate();
			// get the generated id value
			ResultSet rsId = pstmt.getGeneratedKeys();
			rsId.next();
			int studentId = rsId.getInt(1);
			student.setId(studentId);
			return studentId;
		} catch (SQLException e) {
			throw new UniversityException("create student failed", e);
		}
	}

	@Override
	public Student findById(Integer id) throws UniversityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws UniversityException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student bean) throws UniversityException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) throws UniversityException {
		// TODO Auto-generated method stub

	}

}

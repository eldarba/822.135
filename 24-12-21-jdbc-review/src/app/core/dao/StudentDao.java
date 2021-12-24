package app.core.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);) {
			String sql = "select * from student where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Student student = new Student();
				student.setId(id);
				student.setName(rs.getString("name"));
				student.setEnrollDate(rs.getDate("enroll_date").toLocalDate());
				student.setActive(rs.getBoolean("active"));
				return student;
			}
			throw new UniversityException("student " + id + " not found");
		} catch (SQLException e) {
			throw new UniversityException("find student failed", e);
		}
	}

	@Override
	public List<Student> findAll() throws UniversityException {
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);) {
			String sql = "select * from student";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Student> list = new ArrayList<Student>();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEnrollDate(rs.getDate("enroll_date").toLocalDate());
				student.setActive(rs.getBoolean("active"));
				list.add(student);
			}
			return list;
		} catch (SQLException e) {
			throw new UniversityException("find student failed", e);
		}
	}

	@Override
	public void update(Student student) throws UniversityException {
		try {
			findById(student.getId());
		} catch (UniversityException e) {
			throw new UniversityException("update student failed - " + e.getMessage(), e);
		}
		// if we are here - there is such student
		String sql = "update student set name=?, enroll_date=?, active=? where id=?";
		try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setDate(2, Date.valueOf(student.getEnrollDate()));
			pstmt.setBoolean(3, student.isActive());
			pstmt.setInt(4, student.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new UniversityException("update student failed", e);
		}
	}

	@Override
	public void delete(Integer id) throws UniversityException {
		// TODO Auto-generated method stub

	}

}

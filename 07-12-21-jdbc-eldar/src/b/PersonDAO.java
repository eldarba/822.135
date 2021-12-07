package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// Data Access Object
public class PersonDAO {

	private String url = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String password = "1234";

	public void create(Person person) {
		String sql = "insert into person values(0, ";
		sql += "'" + person.getName() + "', " + person.getAge() + ")";
		System.out.println(sql);
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void create2(Person person) {
		String sql = "insert into person values(0, ?, ?)";
		System.out.println(sql);
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, person.getName());
			pstmt.setInt(2, person.getAge());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Person read(int personId) {
		return null;
	}

	public void update(Person person) {

	}

	public void delete(Person personId) {

	}

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		Person p = new Person(0, "Michael", 80);
		dao.create2(p);
		System.out.println("Done");
	}

}

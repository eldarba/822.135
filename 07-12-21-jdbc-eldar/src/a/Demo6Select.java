package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Select {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
			// ============================================
			String sql = "select * from person;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// get the row records
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt(3);
				System.out.println(id + ", " + name + ", " + age);
			}
			System.out.println(sql);
			// ============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

}

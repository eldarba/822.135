package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
			// ============================================
			String sql = "insert into person values(0, 'Nurit', 25);";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);
			// ============================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

}

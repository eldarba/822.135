package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4Update {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
			// ============================================
			String sql = "update `person` set `name` = 'Dan Levi' where `id` = 3;";
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

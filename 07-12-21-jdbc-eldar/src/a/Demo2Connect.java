package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connect {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "1234";
		try (Connection con = DriverManager.getConnection(url, user, password);) {
			System.out.println("connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

}

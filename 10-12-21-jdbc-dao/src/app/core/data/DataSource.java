package app.core.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {

	private String url = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String password = "1234";
	private Connection con;
	private static DataSource instance = new DataSource();

	private DataSource() {
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DataSource getInstance() {
		return instance;
	}

	public Connection getConnection() {
		return this.con;
	}

	public void closeConnction() {
		try {
			this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

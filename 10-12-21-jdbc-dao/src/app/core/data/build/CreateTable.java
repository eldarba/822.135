package app.core.data.build;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import app.core.data.DataSource;

public class CreateTable {

	public static void main(String[] args) {

		String sql = "create table book(\r\n" + "id int primary key auto_increment,\r\n" + "title varchar(25), \r\n"
				+ "author varchar(25),\r\n" + "publication date,\r\n" + "price float\r\n" + ")";

		Connection con = DataSource.getInstance().getConnection();

		try (Statement stmt = con.createStatement();) {
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataSource.getInstance().returnConnection(con);
			DataSource.getInstance().closeDatasource();
		}

	}

}

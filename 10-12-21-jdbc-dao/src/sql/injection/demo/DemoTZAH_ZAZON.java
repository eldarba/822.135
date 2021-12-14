package sql.injection.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DemoTZAH_ZAZON {

	public static void main(String[] args) {

		System.out.println("===== SQL INJECTION EXAMPLE BY TZAH ZAZON =====");
		System.out.println("========== Find Person Data ==========");
		try (Scanner sc = new Scanner(System.in);) {

			while (true) {
				System.out.println("please enter person id");
				System.out.println("(type 3 OR id=1 for SQL Injection)");
				String PersonId = sc.nextLine();

				if (PersonId.equals("1")) {
					System.out.println("--User 1 is VIP, Can't load data--");
				} else {
					ShowPersonData(PersonId);
					// ShowPersonData2(PersonId);//SQL INJECTION PROTECTED VOID
				}
				System.out.println("==========================");
			}
		}

	}

	public static void ShowPersonData2(String PersonId) {
		String userName = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/db1";
		try (Connection con = DriverManager.getConnection(url, userName, password)) {
			System.out.println("connected");
			// ==================================================
			String query = "select * from person where id=?;";
			System.out.println(query);
			PreparedStatement stmt = con.prepareStatement(query);// using PreparedStatment to avoid SQLI|
			stmt.setString(1, PersonId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// get row data
				int id = rs.getInt("id");
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println(id + ", " + name + ", " + age);
			}
			// ==================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

	public static void ShowPersonData(String PersonId) {
		String userName = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/db1";
		try (Connection con = DriverManager.getConnection(url, userName, password)) {
			System.out.println("connected");
			// ==================================================
			String query = "select * from person where id=" + PersonId + ";";
			System.out.println(query);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				// get row data
				int id = rs.getInt("id");
				String name = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println(id + ", " + name + ", " + age);
			}
			// ==================================================
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected");
	}

}

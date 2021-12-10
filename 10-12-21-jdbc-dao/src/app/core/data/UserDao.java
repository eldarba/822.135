package app.core.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	public void takeFrom(Connection con, int userId, double amount) throws Exception {
		String sql = "update `user` set balance = balance - ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, userId);
			int count = pstmt.executeUpdate();
			if (count == 0) {
				throw new Exception("takeFrom " + userId + " failed - user not found");
			}
		} catch (SQLException e) {
			throw new Exception("takeFrom " + userId + " failed", e);
		}
	}

	public void giveTo(Connection con, int userId, double amount) throws Exception {
		String sql = "update `user` set balance = balance + ? where id = ?";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setDouble(1, amount);
			pstmt.setInt(2, userId);
			int count = pstmt.executeUpdate();
			if (count == 0) {
				throw new Exception("giveTo " + userId + " failed - user not found");
			}
		} catch (SQLException e) {
			throw new Exception("giveTo " + userId + " failed", e);
		}
	}

}

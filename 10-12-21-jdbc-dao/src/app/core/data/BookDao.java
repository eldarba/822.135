package app.core.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {

	public int create(Connection con, Book book) {
		String sql = "insert into book values(0,?,?,?,?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDate(3, Date.valueOf(book.getPublication()));
			pstmt.setDouble(4, book.getPrice());
			pstmt.executeUpdate();
			// get the generated id
			ResultSet rsKeys = pstmt.getGeneratedKeys();
			rsKeys.next();
			int id = rsKeys.getInt(1);
			book.setId(id); // set the id of the book
			//
			return id;
		} catch (SQLException e) {
			throw new RuntimeException("create book failed", e);
		}
	}

}

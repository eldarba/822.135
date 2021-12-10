package app.core.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

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

	public Book read(Connection con, int bookId) {
		String sql = "select * from book where id = ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Book book = new Book();
				book.setId(bookId);
				book.setAuthor(rs.getString("author"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setPublication(LocalDate.parse(rs.getDate("publication").toString()));
				return book;
			} else {
				throw new RuntimeException("book id " + bookId + " not found");
			}
		} catch (SQLException e) {
			throw new RuntimeException("read book failed", e);
		}
	}

}

package app.core.data;

import java.sql.Connection;
import java.sql.SQLException;

public class SystemFacade {

	private BookDao bookDao = new BookDao();
	private DataSource ds = DataSource.getInstance();

	public int addBook(Book book) {
		Connection con = null;
		try {
			// start a transaction
			con = ds.getConnection();
			con.setAutoCommit(false);
			int id = bookDao.create(con, book);
			con.commit(); // end the transaction with commit - success
			return id;
		} catch (SQLException e) {
			try {
				// end the transaction with rollback - fail
				if (con != null) {
					con.rollback();
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw new RuntimeException("addBook failed", e);
		} finally {
			ds.returnConnection(con);
		}
	}

	public Book getBook(int bookId) {
		Connection con = DataSource.getInstance().getConnection();
		Book book = this.bookDao.read(con, bookId);
		DataSource.getInstance().returnConnection(con);
		return book;
	}

}

package app.core.data;

import java.sql.Connection;
import java.sql.SQLException;

public class SystemFacade {

	private BookDao bookDao = new BookDao();
	private UserDao userDao = new UserDao();
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
		try {
			Book book = this.bookDao.read(con, bookId);
			return book;
		} catch (Exception e) {
			throw e;
		} finally {
			DataSource.getInstance().returnConnection(con);
		}
	}

	public void transferMoney(int from, int to, double amount) {
		Connection con = DataSource.getInstance().getConnection();
		try {
			con.setAutoCommit(false);
			userDao.takeFrom(con, from, amount);
			userDao.giveTo(con, to, amount);
			con.commit();
			System.out.println("action commited");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
				System.out.println("action rolled back");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DataSource.getInstance().returnConnection(con);
		}
	}

}

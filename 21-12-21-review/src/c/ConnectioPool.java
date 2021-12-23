package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectioPool {

	private Set<Connection> connections = new HashSet<Connection>();
	public static final int POOL_SIZE = 5;
	private String dbUrl = "jdbc:mysql://localhost:3306/db1";
	private String user = "root";
	private String pass = "1234";
	private boolean open;

	private static ConnectioPool instance;

	private ConnectioPool() throws SQLException {
		// add 5 connections to pool
		for (int i = 0; i < POOL_SIZE; i++) {
			this.connections.add(DriverManager.getConnection(dbUrl, user, pass));
		}
		System.out.println("pool initialized with " + connections.size() + " connections");
		open = true;
	}

	public static ConnectioPool getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectioPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() throws Exception {
		if (!open) {
			throw new Exception("getConnection failed - pool is closed");
		}
		while (this.connections.isEmpty()) {
			try {
				System.out.println("wait for connection");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// if we are here - there are available connections
		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public synchronized void returnConnection(Connection con) {
		this.connections.add(con);
		notifyAll();
		System.out.println("connection returned");
	}

	public synchronized void closeAllConnections() {
		open = false;
		while (this.connections.size() < POOL_SIZE) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Iterator<Connection> it = this.connections.iterator();
		while (it.hasNext()) {
			try {
				it.next().close();
				it.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("pool closed with " + connections.size() + " connections");

	}

}

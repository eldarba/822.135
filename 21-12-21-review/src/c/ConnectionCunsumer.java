package c;

import java.sql.Connection;
import java.util.concurrent.TimeUnit;

public class ConnectionCunsumer extends Thread {

	@Override
	public void run() {
		try {
			Connection con = ConnectioPool.getInstance().getConnection();
			TimeUnit.SECONDS.sleep(5);
			ConnectioPool.getInstance().returnConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

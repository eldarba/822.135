package c;

public class TestPool {

	public static void main(String[] args) {

		try {
			ConnectioPool.getInstance();
			Thread.sleep(2000);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			for (int i = 0; i < 25; i++) {
				new ConnectionCunsumer().start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				Thread.sleep(60000);
				ConnectioPool.getInstance().closeAllConnections();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

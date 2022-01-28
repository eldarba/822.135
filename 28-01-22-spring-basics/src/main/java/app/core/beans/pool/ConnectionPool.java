package app.core.beans.pool;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPool implements InitializingBean, DisposableBean {

	private boolean on;

	{
		System.out.println("ConnectionPool instantiated");
	}

	public void startThePool() {
		System.out.print("starting pool...");
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		on = true;
		System.out.println("pool started");
	}

	public String getConnection() {
		if (on) {
			return "CON";
		} else {
			throw new RuntimeException("pool is not on");
		}
	}

	public void closeThePool() {
		on = false;
		System.out.println("pool closed");
	}

	// life cycle hook - create
	@Override
	public void afterPropertiesSet() throws Exception {
		startThePool();
	}

	// life cycle hook - destroy
	@Override
	public void destroy() throws Exception {
		closeThePool();
	}

}

package app.core.jobs;

import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Job1 extends Thread {

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				break;
			}
			System.out.println("---------- deleting expired coupons");
		}
	}

	@PostConstruct
	public void startThread() {
		this.start();
	}

	@PreDestroy
	public void stopThread() {
		this.interrupt();
	}

}

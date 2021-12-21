package b;

import java.util.concurrent.TimeUnit;

public class ReminderThread extends Thread {

	private String message;
	private long delay;
	private long interval;

	public ReminderThread(String message, long delay, long interval) {
		super();
		this.message = message;
		this.delay = delay;
		this.interval = interval;
	}

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(delay);
		} catch (InterruptedException e1) {
			return;
		}
		while (true) {
			System.out.println(message);
			try {
				TimeUnit.SECONDS.sleep(interval);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

}

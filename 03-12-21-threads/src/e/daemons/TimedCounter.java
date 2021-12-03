package e.daemons;

public class TimedCounter extends Thread {

	private long sleepTime;

	public TimedCounter(String name, long sleepTime) {
		super(name);
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ": " + i + " - is Daemon? " + isDaemon());
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

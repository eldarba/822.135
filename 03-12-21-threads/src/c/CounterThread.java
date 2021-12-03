package c;

public class CounterThread extends Thread {

	// declare an attribute
	private Mode mode;

	// declare an enum type
	public enum Mode {
		STOP, COUNT_DOWN, IGNORE;
	}

	public CounterThread(String name, Mode mode) {
		super(name);
		this.mode = mode;
	}

	public CounterThread(String name) {
		this(name, null);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + " - " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// HOW THE THREAD RESPONDS TO INTERRUPT:
				// ignore interrupt
				if (mode == Mode.IGNORE) {
					continue;
				}
				// stop
				if (mode == Mode.STOP) {
					break;
				}
				// count down
				for (int j = i; j >= 0; j--) {
					System.out.println(getName() + " - " + j);
					try {
						sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				break;
			}
		}
	}

}

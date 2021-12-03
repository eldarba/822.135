package d;

public class SpeedThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			if (this.isInterrupted()) {
				break;
			}
			System.out.println(i);
		}
	}
}

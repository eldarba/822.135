package f.synch;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PrinterThread extends Thread {

	private List<Integer> list;

	public PrinterThread(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {

		System.out.println("printer started");

		// start of critical section
		synchronized (list) {

			int size = list.size();

			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(list.get(size - 1));

		}

		System.out.println("printer ended");
	}

}

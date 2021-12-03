package f.synch;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DeleteThread extends Thread {

	private List<Integer> list;

	public DeleteThread(List<Integer> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {

		System.out.println("deleter started");

		synchronized (list) {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			list.remove(list.size() - 1);
		}

		System.out.println("deleter ended");
	}

}

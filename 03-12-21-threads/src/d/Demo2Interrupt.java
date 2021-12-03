package d;

import java.util.concurrent.TimeUnit;

import c.CounterThread;
import c.CounterThread.Mode;

public class Demo2Interrupt {

	public static void main(String[] args) throws InterruptedException {
		CounterThread t1 = new CounterThread("t1-stop", Mode.STOP);
		CounterThread t2 = new CounterThread("t2-countDown", Mode.COUNT_DOWN);
		CounterThread t3 = new CounterThread("t3-ignore", Mode.IGNORE);
		t1.start();
		t2.start();
		t3.start();

//		Thread.sleep(3000);
		TimeUnit.SECONDS.sleep(4);

		System.out.println("interrupting all");
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();

	}

}

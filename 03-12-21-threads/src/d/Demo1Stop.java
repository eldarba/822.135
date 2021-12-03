package d;

import java.util.concurrent.TimeUnit;

import c.CounterThread;

public class Demo1Stop {

	public static void main(String[] args) throws InterruptedException {
		CounterThread t1 = new CounterThread("t1");
		t1.start();

//		Thread.sleep(3000);
		TimeUnit.SECONDS.sleep(3);

		System.out.println("stopping t1");
		t1.stop(); // stop the thread using deprecated method

	}

}

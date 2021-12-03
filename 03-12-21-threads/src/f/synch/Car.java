package f.synch;

import java.util.concurrent.TimeUnit;

public class Car {

	private int id;
	private int km;

	private static int c = 101;

	{ // initializer - runs befor CTOR
		this.id = c++;
	}

	// critical section method - threads ask for the monitor of "this"
	public synchronized void drive(int distance) {
		System.out.println(
				Thread.currentThread().getName() + " started at " + km + " km for " + distance + " km, with car " + id);
		km += distance;
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				Thread.currentThread().getName() + " finished at " + km + " km (" + distance + " km), with car " + id);
	}

}

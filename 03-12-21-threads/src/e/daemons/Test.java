package e.daemons;

public class Test {

	public static void main(String[] args) {

		TimedCounter t1 = new TimedCounter("t1", 1000);
		TimedCounter t2 = new TimedCounter("t2", 400);

		t1.setDaemon(true);
		t1.start();

		t2.start();

	}

}

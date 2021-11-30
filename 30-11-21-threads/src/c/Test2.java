package c;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		CounterThread t1 = new CounterThread("t1");
		System.out.println(t1.getState());
		System.out.println("ALIVE? " + t1.isAlive());

		t1.start();
		System.out.println(t1.getState());
		System.out.println("ALIVE? " + t1.isAlive());

		Thread.sleep(250);
		System.out.println(t1.getState());

		System.out.println("main: waiting for t1 to join");
		t1.join(); // causes this thread (main) to stop until t1 is terminated
		System.out.println("main: t1 is terminated");
		System.out.println(t1.getState());
		System.out.println("ALIVE? " + t1.isAlive());

	}

}

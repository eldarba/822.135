package a;

public class TheMainThread {

	public static void main(String[] args) throws InterruptedException {

		// if main is running there must be a Thread object for it.
		// get a reference to the currently executing Thread object.
		Thread t = Thread.currentThread();
		System.out.println("thread name is: " + t.getName());

		System.out.println(1);
		Thread.sleep(1000);
		System.out.println(2);
		Thread.sleep(1000);
		System.out.println(3);

	}

}

package d;

public class SpeedThreadTest {

	public static void main(String[] args) throws InterruptedException {
		SpeedThread t = new SpeedThread();
		t.start();

		Thread.sleep(3);

		System.out.println("=======================================");
		t.interrupt();

	}

}

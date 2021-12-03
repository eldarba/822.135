package g.waitAndNotify;

public class Consumer extends Thread {

	private Stack stack;
	private int amount;

	public Consumer(String name, Stack stack, int amount) {
		super(name);
		this.stack = stack;
		this.amount = amount;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = stack.pop();
//			System.out.println(getName() + " consumed: " + x);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

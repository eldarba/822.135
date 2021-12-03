package g.waitAndNotify;

public class Producer extends Thread {

	private Stack stack;
	private int amount;

	public Producer(String name, Stack stack, int amount) {
		super(name);
		this.stack = stack;
		this.amount = amount;
	}

	@Override
	public void run() {
		for (int i = 0; i < amount; i++) {
			int x = (int) (Math.random() * 101);
			stack.push(x);
			// System.out.println(getName() + " produced: " + x);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

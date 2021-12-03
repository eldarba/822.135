package g.waitAndNotify;

public class Test {

	public static void main(String[] args) {

		Stack stack = new Stack();

		Producer p1 = new Producer("p1", stack, 20);
		Producer p2 = new Producer("p2", stack, 30);

		Consumer c1 = new Consumer("c1", stack, 10);
		Consumer c2 = new Consumer("c2", stack, 15);
		Consumer c3 = new Consumer("c3", stack, 10);
		Consumer c4 = new Consumer("c4", stack, 10);
		Consumer c5 = new Consumer("c5", stack, 5);

		p1.start();
		p2.start();

		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();

	}

}

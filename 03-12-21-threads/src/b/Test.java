package b;

public class Test {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		t1.start();
		t2.start();

		System.out.println("END OF MAIN");
	}

}

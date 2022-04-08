package a;

public class Demo1 {

	public static void main(String[] args) {

		// lambda expression - is used to implement functional interfaces
		// functional interfaces - has only 1 abstract method
		Runnable r = () -> System.out.println("aaa");

		Thread t = new Thread(r);

		t.start();

	}

}

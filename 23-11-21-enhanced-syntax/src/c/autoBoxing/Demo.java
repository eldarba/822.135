package c.autoBoxing;

public class Demo {

	public static void main(String[] args) {

		Integer a = new Integer(5); // inbox
		Integer b = 5; // auto-inbox
		System.out.println(a);
		System.out.println(b);

		int x = a.intValue(); // outbox
		int y = b; // auto-outbox

	}

}

package a;

public class Demo3 {

	public static void main(String[] args) {
		greet("Dan", null);

		greet("Lea", () -> {
			System.out.println("welcome to our company");
			System.out.println("Your office is in floor 20");
		});
	}

	public static void greet(String user, AdditionalActions more) {
		System.out.println("Hello " + user);
		if (more != null) {
			more.doIt();
		}
	}

	interface AdditionalActions {
		void doIt();
	}

}

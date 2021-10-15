package b.flow.control;

public class Demo04Switch {

	public static void main(String[] args) {

		int mode = (int) (Math.random() * 5) + 1; // 1 - 5 inclusive
		System.out.println(mode);

		switch (mode) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default: // default runs if no case applies. it is optional
			System.out.println("some other value");
		}

	}

}

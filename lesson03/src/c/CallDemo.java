package c;

public class CallDemo {
	
	public static void main(String[] args) {
		m1(); // call m1
	}
	
	public static void m1() {
		int a = 5;
		m2(a);  // java implements call by value (rather call by reference)
		System.out.println(a); // 5
	}
	
	public static void m2(int a) {
		System.out.println(a);
		a = 100;
		System.out.println(a);
	}

}

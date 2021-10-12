package a;

public class DemoPrimitiveTypes5 {

	public static void main(String[] args) {
		int x = 500;
		x = 200; // assignment
		System.out.println(x = 300); // assignment + output
		System.out.println(x);

		int a, b, c, d;
		a = b = c = d = 5;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int val = 10;
		System.out.println(val++); // 10: print and than assign
		System.out.println(val); // 11
		System.out.println(++val); // 12: assign and than print
		System.out.println(val); // 12
		
		
	}

}

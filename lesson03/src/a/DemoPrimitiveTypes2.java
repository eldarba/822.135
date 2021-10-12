package a;

public class DemoPrimitiveTypes2 {

	public static void main(String[] args) {
		
		byte x = 100;
		long y = x;
		// x = y; error long cannot be safely represented by byte
		
		long val = 9999999999999L;
		float f = val;
		
		System.out.println(val);
		System.out.println(f);
	}

}

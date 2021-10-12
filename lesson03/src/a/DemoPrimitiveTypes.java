package a;

public class DemoPrimitiveTypes {

	public static void main(String[] args) {
		
		// numerals
		//integers
		byte a = 10; // a is a variable, 10 is literal
		short b = 100;
		int c = 1000;
		long d = 10000;
		
		//decimals
		float n1 = 10.3F;
		double n2 = 1000.32;
		
		// literals
		System.out.println(5); // literal integer is int by default
		System.out.println(5.7);  // literal decimal is double by default
		
		// Suffix for literal types
		// L - long
		// D - double 
		// F - float
		
		System.out.println(0.333333333333333333333333333D);
		System.out.println(0.333333333333333333333333333F);
		System.out.println(5);
		System.out.println(5D);
		
		long x = 9999999999L;
		
		byte num = 127;
		System.out.println(num);
		num++; // overflow - the variable will continue to lower bound
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		
		///////////////////////////////////
		System.out.println("==================");
		int val1 = 10;
		float val2 = 5.3F;
		
		// calculated expressions has type according to the variable types
		float sum =  val1 + val2;
		
		

	}

}

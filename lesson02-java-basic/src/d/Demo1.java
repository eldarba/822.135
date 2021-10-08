package d;

public class Demo1 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		// expression is a part of statement that is calculated to a value
		// Statements ends with ;
		int z = x + y;
		
		{ // this is a block
			int a = 22;
			int b = 33;
			System.out.println(a);
			System.out.println(b);
		}
		
		{ // this is another block
//			System.out.println(a); error - a is out of scope
		}
		

	}

}

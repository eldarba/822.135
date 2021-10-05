package a;

public class App1 {

	public static void main(String[] args) {

		// integer
		// decimal
		double y = 5.3;
		// boolean
		boolean areYouHappy = true;
		System.out.println(areYouHappy);
		// text
		String str = "this is a string of characters";
		System.out.println(str);
		
		int x = 5;
		// create an object of type Product
		Product p = new Product(); 
		
		// use the . operator to access the object
		p.name = "shirt";
		p.price = 25;
		
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.price);
		

	}

}

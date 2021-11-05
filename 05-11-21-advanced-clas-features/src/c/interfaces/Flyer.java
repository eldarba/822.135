package c.interfaces;

public interface Flyer {

	// constants
	int MAX_ALT = 1000;

	// abstract method - concrete implementors must implement
	void fly();

	// default method - concrete implementors can override
	default void greet() {
		System.out.println("Hello");
	}

}

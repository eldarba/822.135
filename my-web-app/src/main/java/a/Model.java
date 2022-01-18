package a;

import java.time.LocalDateTime;

public class Model {

	public String helloWorld() {
		return "hello world web: " + LocalDateTime.now();
	}
	
	public double sum(double a, double b) {
		return a + b;
	}
}

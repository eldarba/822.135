package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	private double res;

	public void add(double val) {
		res += val;
	}

	public void sub(double val) {
		res -= val;
	}

	public void mul(double val) {
		res *= val;
	}

	public void div(double val) {
		res /= val;
	}

	public double getRes() {
		return res;
	}

	public void clear() {
		res = 0;
	}

}

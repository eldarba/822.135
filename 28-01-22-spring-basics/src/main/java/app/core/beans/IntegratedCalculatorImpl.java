package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IntegratedCalculatorImpl implements IntegratedCalculator {

	@Autowired
	private Calculator calculator;
	@Autowired
	private Converter converter;

	@Override
	public void add(double val) {
		calculator.add(val);
	}

	@Override
	public void sub(double val) {
		calculator.sub(val);
	}

	@Override
	public void mul(double val) {
		calculator.mul(val);
	}

	@Override
	public void div(double val) {
		calculator.div(val);
	}

	@Override
	public double getRes() {
		return calculator.getRes();
	}

	@Override
	public void clear() {
		calculator.clear();
	}

	@Override
	public double getInCentimeter(double meter) {
		return converter.getInCentimeter(meter);
	}

	@Override
	public double getInMeters(double centiMeter) {
		return converter.getInMeters(centiMeter);
	}

}

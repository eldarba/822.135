package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class Converter {

	public double getInCentimeter(double meter) {
		return meter * 100;
	}

	public double getInMeters(double centiMeter) {
		return centiMeter / 100;
	}

}

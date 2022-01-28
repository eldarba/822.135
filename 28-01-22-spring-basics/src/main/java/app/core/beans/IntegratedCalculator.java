package app.core.beans;

public interface IntegratedCalculator {

	void add(double val);

	void sub(double val);

	void mul(double val);

	void div(double val);

	double getRes();

	void clear();

	double getInCentimeter(double meter);

	double getInMeters(double centiMeter);

}

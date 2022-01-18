package app.core.beans.cars;

public interface Car {

	int getNumber();

	String getModel();

	String getEngineModel();

	String getGearModel();

	void start();

	void drive(int distance);

	void stop();

}

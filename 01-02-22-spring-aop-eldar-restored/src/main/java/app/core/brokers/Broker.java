package app.core.brokers;

public interface Broker {

	void buyStocks(int quantity);

	void buyCars(int quantity);

	void sellStocks(int quantity);

	void sellCars(int quantity);

}

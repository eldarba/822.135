package app.core.brokers;

public interface Broker {

	void buyStocks(int quantity);

	int buyCars(int quantity) throws BrokerException;

	void sellStocks(int quantity);

	void sellCars(int quantity);

}

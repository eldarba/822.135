package app.core.brokers;

import org.springframework.stereotype.Component;

@Component
public class BrokerImpl implements Broker {

	@Override
	public void buyStocks(int quantity) {
		System.out.println("Buying " + quantity + " stocks");
	}

	@Override
	public void buyCars(int quantity) {
		System.out.println("Buying " + quantity + " cars");
	}

	@Override
	public void sellStocks(int quantity) {
		System.out.println("Selling " + quantity + " stocks");
	}

	@Override
	public void sellCars(int quantity) {
		System.out.println("Selling " + quantity + " cars");
	}

}

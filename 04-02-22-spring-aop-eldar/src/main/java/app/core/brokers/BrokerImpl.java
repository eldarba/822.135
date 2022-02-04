package app.core.brokers;

import org.springframework.stereotype.Component;

@Component
public class BrokerImpl implements Broker {

	@Override
	public void buyStocks(int quantity) {
		System.out.println("Buying " + quantity + " stocks");
	}

	@Override
	public int buyCars(int quantity) throws BrokerException {
		if (Math.random() < 0.5) {
			System.out.println("Buying " + quantity + " cars");
			return quantity;
		} else {
			throw new BrokerException("Buying cars failed - try again later");
		}
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

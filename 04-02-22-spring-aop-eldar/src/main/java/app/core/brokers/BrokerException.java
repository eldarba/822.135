package app.core.brokers;

public class BrokerException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public BrokerException() {
	}

	public BrokerException(String message) {
		super(message);
	}

	public BrokerException(Throwable cause) {
		super(cause);
	}

	public BrokerException(String message, Throwable cause) {
		super(message, cause);
	}

	public BrokerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

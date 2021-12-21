package a;

public class DictionaryException extends RuntimeException {

	public DictionaryException() {
	}

	public DictionaryException(String message) {
		super(message);
	}

	public DictionaryException(Throwable cause) {
		super(cause);
	}

	public DictionaryException(String message, Throwable cause) {
		super(message, cause);
	}

	public DictionaryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

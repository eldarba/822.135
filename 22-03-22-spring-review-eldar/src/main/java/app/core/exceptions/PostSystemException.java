package app.core.exceptions;

public class PostSystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PostSystemException() {
	}

	public PostSystemException(String message) {
		super(message);
	}

	public PostSystemException(Throwable cause) {
		super(cause);
	}

	public PostSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public PostSystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

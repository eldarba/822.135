package app.core.exceptions;

public class UniversityException extends Exception {

	private static final long serialVersionUID = 1L;

	public UniversityException() {
	}

	public UniversityException(String message) {
		super(message);
	}

	public UniversityException(Throwable cause) {
		super(cause);
	}

	public UniversityException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniversityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

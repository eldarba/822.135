package app.core.exceptions;

public class EducationalSystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EducationalSystemException() {
	}

	public EducationalSystemException(String message) {
		super(message);
	}

	public EducationalSystemException(Throwable cause) {
		super(cause);
	}

	public EducationalSystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public EducationalSystemException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

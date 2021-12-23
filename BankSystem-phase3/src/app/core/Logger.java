package app.core;

public class Logger {

	// 1 - the instance
	private static Logger instance = new Logger(null);
	private String driverName;

	// 2 - private CTOR
	private Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	// 3 - the instance getter
	public static Logger getInstance() {
		return instance;
	}

	public void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		return null;
	}

}

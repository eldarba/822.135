package app.core;

/**
 * 
 * the Log class represents a single action of bank client
 *
 * @author Eldar
 */
public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	public Log(int clientId, String description, float amount) {
		this(System.currentTimeMillis(), clientId, description, amount);
	}

	public String getData() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

	public static void main(String[] args) {
		Log log1 = new Log(101, "open acount", 2000);
		Log log2 = new Log(0, 102, "close acount", 2000);
		System.out.println(log1.getData());
		System.out.println(log2.getData());
	}

}

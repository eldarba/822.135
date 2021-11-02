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

	public String getData() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

}

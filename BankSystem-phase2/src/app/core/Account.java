package app.core;

public class Account {

	private int id;
	private float balance;

	public Account(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void addToBalance(float amount) {
		this.balance += amount;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

}

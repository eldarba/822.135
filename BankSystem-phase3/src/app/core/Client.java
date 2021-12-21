package app.core;

public class Client {

	private int id;
	private String name;
	private float balance; // checking account Over Va Shav
	private Account[] accounts = new Account[5];
	private float commissionRate = 0.1F;
	private float interestRate;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account; // add the account to the array
				// log the operation ============================================
				// set the values for the log instance
				long ts = System.currentTimeMillis();
				int clientId = this.id;
				String description = "addAccount";
				float amount = account.getBalance();
				// create the log instance
				Log log = new Log(ts, clientId, description, amount);
				// log the log instance - print to screen
				Logger.getInstance().log(log);
				// ================= ============================================
				return; // exit the method
			}
		}
		// if we are here - the array is full
		System.err.println("addAccount failed - array is full");
	}

	public static void main(String[] args) {
		Client client = new Client(101, "aaa", 1000);
		System.out.println("client balance: " + client.getBalance());
		client.addAccount(new Account(222, 20333));
		System.out.println("get account 111: " + client.getAccount(111));
		System.out.println("get account 222: " + client.getAccount(222));
		client.removeAccount(222);
		System.out.println("get account 222: " + client.getAccount(222));
		System.out.println("client balance: " + client.getBalance());
	}

	public void deposit(float amount) {
		float commission = amount * commissionRate;
		this.balance += amount;
		this.balance -= commission;
		// log the operation ==========
		Log log = new Log(this.id, "deposit", amount);
		Logger.getInstance().log(log);
		// ================= ==========
	}

	public void withdraw(float amount) {
		float commission = amount * commissionRate;
		this.balance -= amount;
		this.balance -= commission;
		// log the operation ==========
		Log log = new Log(this.id, "withdraw", amount);
		Logger.getInstance().log(log);
		// ================= ==========
	}

	public void autoUpdateAccounts() {
		for (Account currentAccount : this.accounts) {
			if (currentAccount != null) {
				float interest = currentAccount.getBalance() * interestRate;
//				currentAccount.setBalance(currentAccount.getBalance() + interest);
				currentAccount.addToBalance(interest);
			}
		}
	}

	public Account getAccount(int accountId) {
		Account account = null;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accountId == accounts[i].getId()) {
				account = accounts[i];
				break;
			}
		}
		return account;
	}

	public Account getAccount(Account account) {
		for (Account curr : accounts) {
			if (curr.equals(account)) {
				return curr;
			}
		}
		return null;
	}

	public void removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == accountId) {
				Account accountToRemove = accounts[i];
				// 1. remove the account from the array
				accounts[i] = null;
				// 2. transfer the account balance to this client balance
				this.balance += accountToRemove.getBalance();
				// 3. log the operation
				// log the operation ============================================
				// set the values for the log instance
				long ts = System.currentTimeMillis();
				int clientId = this.id;
				String description = "removeAccount with id: " + accountToRemove.getId();
				float amount = accountToRemove.getBalance();
				// create the log instance
				Log log = new Log(ts, clientId, description, amount);
				// log the log instance - print to screen
				Logger.getInstance().log(log);
				// ================= ============================================
				return;
			}
		}
		System.err.println("removeAccount failed - not found");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

}

package come.hhj.entity;

public class Account {
	private int accountid;
	private int balance;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", balance=" + balance + "]";
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}

package classes;

public class Account {
	
	private int accountNumber ;
	private String name;
	private float balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	public void setName(String studentName) {
		name=studentName;
	}
	public float getBalance() {
		return balance;
	}
	public void setAccountNumber(int accountNo) {
		accountNumber = accountNo;
	}
	
	public void depositAmount(float amount) {
	//	if(amount >= 100 && amount <= 20000)
			balance = balance + amount;
	}
	
	public void withDrawLimit(float amount) {
		//if(balance - amount > 1500 && balance - amount <= 20000)
			balance = balance - amount;
	}
	public void transferBalance(float amount, Account transferaccount) {
		this.withDrawLimit(amount);
		transferaccount.depositAmount(amount);
	}
	public Account(int accountNumber,String name,float balance) {
		this.accountNumber=accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
}

package classes;

public class Account {
	
	private int accountNumber ;
	String name;
	private float balance;
	
	public void setAccountNumber(int accountNo) {
		accountNumber = accountNo;
	}
	
	public void depositAmount(float amount) {
		if(amount > 1500)
			balance = amount;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void withDraw(float amount) {
		if(balance - amount > 1500)
			balance = balance - amount;
	}
	
	
	
	
}

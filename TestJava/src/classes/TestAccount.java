package classes;

public class TestAccount {

	public static void main(String[] args) {

		Account account1 = new Account(1,"account1",1500);
		//account1.depositAmount(1600);
		account1.withDrawLimit(350);
		System.out.println(account1);
		System.out.println("Account Number = "+account1.getAccountNumber());
		System.out.println("Name = "+account1.getName());
		System.out.println("Balance = "+account1.getBalance());
		System.out.println("");
		
		Account account2 = new Account(2,"account2",1500);
		account2.depositAmount(99);
		System.out.println(account2);
		System.out.println("Account Number = "+account2.getAccountNumber());
		System.out.println("Name = "+account2.getName());
		System.out.println("Balance = "+account2.getBalance());
		System.out.println("");

		Account account3 = new Account(3,"account3",2000);
		account3.depositAmount(20001);
		System.out.println(account3);
		System.out.println("Account Number = "+account3.getAccountNumber());
		System.out.println("Name = "+account3.getName());
		System.out.println("Balance = "+account3.getBalance());
		System.out.println("");

		Account account4 = new Account(4,"account4",111);
		account4.depositAmount(19000);
		System.out.println(account4);
		System.out.println("Account Number = "+account4.getAccountNumber());
		System.out.println("Name = "+account4.getName());
		System.out.println("Balance = "+account4.getBalance());
	}

}

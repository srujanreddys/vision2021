package classes;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
		acc1.name = "Anurag";
		acc1.depositAmount(1600);
		System.out.println(acc1);
		System.out.println(acc1.name);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new Account();
		acc2.name = "Srujan";
		acc2.depositAmount(100);
		System.out.println(acc2);
		System.out.println(acc2.name);
		System.out.println(acc2.getBalance());
		
	}

}

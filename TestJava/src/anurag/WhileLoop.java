package anurag;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		//printOneToHunderOddNumbers();
	//	PrintAllNaturalNumbers(100);
	//	PrintAllNaturalNumbers(50);
		SumOfAllNumbersFromOneToHundred();
		SumOfAllEvenNumbers();
	}
	public static void printOneToHunderOddNumbers() {
			int a=1;
		while (a<=100) {
			System.out.println(a);
			a = a +2 ;
		}
		for (int b=2; b<=100; b++) {
			System.out.println(b);
		}
	}
	public static void PrintAllNaturalNumbers(int n) {
		int a=1;
		while (a<=n) {
			System.out.println(a);
			a = a +1 ;
		}
	}
	public static int SumOfAllNumbersFromOneToHundred() {
		int a=1;
		int sum= 0;
		while (a<=10) { //true,true,true
			sum=sum+a;  //sum=2;a=1,a=2;sum=4,a=3;sum=7
			a=a+1;		//2;3;
		}
		System.out.println(sum);
		return sum;
	}
	public static int SumOfAllEvenNumbers() {
		int b=0;
		int sum =0;
		while (b<=10) {
			if (b%2==0) {
				sum=sum+b;
				b=b+1;
			}System.out.println(sum);
		}
		return sum;
	}

}

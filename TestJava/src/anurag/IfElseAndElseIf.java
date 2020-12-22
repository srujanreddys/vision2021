package anurag;

public class IfElseAndElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=10;
		int c=15;
		//int investment =10;
		//int returns = 20;
		CheckingWhetherANumberIsNegativePositiveOrZero(0);
		System.out.println(checkwhetherANumberIsEvenOrOddReturnTrueIfEvenElseFalse(a));
		inputWeekNumberAndPrintWeekDay(7);
		CalculateProfitOrLoss(10 ,20);
		CalculateProfitOrLoss(20 ,17);
		CalculateProfitOrLoss(10 ,10);
		MaximumBetweenThreeNumbers(a, b, c);
		NumberIsDivisibleBy5And11OrNot(10);
	}
	public static int CheckingWhetherANumberIsNegativePositiveOrZero (int a) {
		a =30;
		if (a<=-1) {
			System.out.println("Negative");		
	}
		else if (a>=1) {
				System.out.println("Positive");
	}   else 
		System.out.println("Zero");
			return 0;
	}
	public static boolean checkwhetherANumberIsEvenOrOddReturnTrueIfEvenElseFalse(int a) {
		if (a%2==0) {
			return true;
		}
		else return false;
	}
	public static int inputWeekNumberAndPrintWeekDay (int a) {
		if (a==1) {
			System.out.println("Monday");
		}else if (a==2) {
			System.out.println("Tuesday");
		}
		else if (a==3) {
			System.out.println("Wednesday");
		}
		else if (a==4) {
			System.out.println("Thursday");
		}
		else if (a==5) {
			System.out.println("Friday");
		}
		else if (a==6) {
			System.out.println("Saturday");
		}
		else if (a==7) {
			System.out.println("Sunday");
		}
		else
			System.out.println("Invalid Input");
		return 0;
	}
	public static void CalculateProfitOrLoss (int investment, int returns) {
		if (investment<returns) {
			System.out.println("Profit");
		}
		else if (investment>returns) {
			System.out.println("Loss");
		}
		else {
			System.out.println("No profit and no loss");
		}
	}
	public static int MaximumBetweenThreeNumbers(int a, int b, int c) {
		if (a>b && a>c) {
			System.out.println(a);
		}
		else if (b>c && b>a) {
			System.out.println(b);
		}
		else System.out.println(c);
		return c;
		}
	public static int NumberIsDivisibleBy5And11OrNot (int a) {
		if (a%5==0 && a%11==0) {
			System.out.println("Number is divisible by 5 and 11");
		}
		else System.out.println("The given number is not divisible by 5 and 11");
		return 0;
	}
	}
	

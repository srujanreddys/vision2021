package anurag;

public class AllInOneProgram {

	public static void main(String[] args) {
		int a=8;
		int b=4;
		int c=4;
		int d=4;
		String e= "Anurag ";
		String f= "Reddy";
		sum(a, b);
		System.out.println(sum(a, b));
		str_combine(e,f);
		str_combine("i am ","fine");
		IntegersDifferences(a, b);
		TrueOrFalse(a, b, c, d);
		System.out.println(TrueOrFalse(4, b, c, d));
		int i = 1;
		while(i <=100) {
			System.out.println(i);
			i = i +2 ;
		}
	}
	public static int sum (int a,int b) {
		if (a>b) {
			return a;
		}
			return b;
	}
	public static void str_combine(String a, String b) {
		System.out.println(a+b);
	}
	public static void IntegersDifferences(int a, int b) {
		System.out.println("Sum of two integers "+(a+b));
		System.out.println("Difference of two integers "+(a-b));
		System.out.println("Product of two integers "+(a*b));
		System.out.println("Average of two integers "+(a+b)/2);
		System.out.println("Distance of two integers "+(a-b));
	}
	public static boolean TrueOrFalse(int a,int b,int c, int d) {
		if ((a==b)&(b==c)&(c==d)) {
			return true;
		}
			return false;
	}
	//Deduct 32, then multiply by 5, then divide by 9
	public static double FartoCelcius(double tempInFar) {
		double celcius = ((tempInFar - 32) * 5)/9;
		return celcius;
	}
	
	
}

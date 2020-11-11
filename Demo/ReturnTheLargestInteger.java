package anurag;

public class ReturnTheLargestInteger {

	public static void main(String[] args) {
		int a=2;
		int b=4;
		sum(a, b);
		int value=sum(a, b);
		System.out.println(value);
		System.out.println(sum(8, 2));	
	}
	public static int sum (int a,int b) {
		if (a>b) {
		return a;
		}
		return b;
		}
	}


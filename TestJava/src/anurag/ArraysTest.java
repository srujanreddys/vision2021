package anurag;

public class ArraysTest {

	public static void main(String[] args) {
		int  array[] = {11,21,31,5,6,6,20,49,13};
		String str[] = {"121car#[]","bus"};
		char charArray[] = {'a','1','#'};
		
		//printTheInputInteger(8);
		//printTheInputArrayElements(array);
		int x = 3;
		int y = 5;
		int sum = x + y;
		System.out.println(sum);
		
		String s1 = "srujan";
		String s2 = "reddy";
		char[] c = {'r','e','d','d','y'};
		String s3 = s1 + s2;
		
		
		System.out.println(s3);
		printSecondElementOfString(s1);
		printTheInputArrayElements(str);
		int i = 123456;
		System.out.println(i);
		
 		
	}
	public static void printTheInputArrayElements(int[] x) {
		for(int a = 0;a<x.length; a++) {
 			System.out.println(x[a]);
 		}
	
	}
	
	public static void printTheInputInteger(int a) {
		System.out.println(a);
	}
	
	public static void printTheInputArrayElements(String[] x) {
		for(int a = 0;a<x.length; a++) {
 			System.out.println(x[a]);
 		}
	}
	
	public static void printSecondElementOfString(String str) {
		System.out.println(str.toUpperCase());
	}
	
	
}

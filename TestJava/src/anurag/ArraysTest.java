package anurag;

public class ArraysTest {

	public static void main(String[] args) {
		int  array[] = {11,21,31,5,6,6,20,49,13};
		int array1[] = {9,2,3,4,5,6,12,8};
		String str[] = {"121car#[]","bus"};
		String s1 = "srujan";
		String s2 = "reddy";
		String s3 ="12345";
	//	int i = 123456;
		printTheInputArrayElements(array);
		printTheInputInteger(8);
		printTheInputArrayElements(str);
		printSecondElementOfString(s1);
		printAllElementsOfString(s2);
		printAllArrayInReverseOrder(array);
		printAllArrayInReverseOrder(array1);
		printsTheSumOfTheEvenAndOddIntegers(array1);
		printAllEvenIndexElementsOfAString(s1);
		printAllEvenIndexElementsOfAString(s3);
		printsTheSumOfArray(array1);
		}
	public static void printTheInputArrayElements(int[] x) {
		for(int a = 0;a<x.length; a++) {
 			System.out.println(x[a]);
		}}
	public static void printTheInputInteger(int a) {
		System.out.println(a);
		}
	public static void printTheInputArrayElements(String[] x) {
		for(int a = 0;a<x.length; a++) {
 			System.out.println(x[a]);
 		}}
	public static void printSecondElementOfString(String str) {
		System.out.println(str.toUpperCase());
		}
	public static void printAllElementsOfString (String str) {
	for (int i = 0; i < str.length(); i++) {
		System.out.println(str.charAt(i));
		}}
	public static void printAllArrayInReverseOrder (int [] ReverseOrder) {
		for (int i = ReverseOrder.length-1; i >= 0; i--) {
			System.out.println(ReverseOrder[i]);
		}}
	public static void printsTheSumOfTheEvenAndOddIntegers(int[] array) {      //  int array1[] = {9,2,3,4,5,6,12,8};
			int even=0;
			int odd=0;
		for (int i = 0; i<array.length; i++) {			//increasing i value +1 for every loop till 8
			if (array[i]%2==0) {						//checking elements/2=0 or not if yes it will pass the value of element if not it will go to another condition
				even=even+array[i];						//it stores the sum of above condition value if the condition is true
			}if (array[i]%2!=0) {						//checking elements/2!=0 or not if yes it will pass the value of element if not it will go to another condition
				odd=odd+array[i];						//it stores the sum of above condition value if the condition is true
			}
		}			
		System.out.println(even+" Sum of Even");	
		System.out.println(odd+" Sum of Odd");
		}
	public static void printAllEvenIndexElementsOfAString (String str) {
		for (int i = 0; i <str.length(); i++) {
			if (i%2==0) {
				System.out.println(str.charAt(i));
			}
		}			
	}
	public static void printsTheSumOfArray(int[] array) {  	//	int array1[] = {1,2,3,1,1,4};

		int sum=0;
		for (int i = 0; i<array.length; i++) { //0<=3 true,1<=3 true,2<=3 true
			sum=sum+array[i];		//0+1=1,1+2=3,3+3=6
		}
		System.out.println(sum);
	}
}

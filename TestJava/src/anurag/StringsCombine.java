package anurag;

public class StringsCombine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = {"a","n","u","r","a","g"};
		String one= "Anurag";
		String two= "srujan";
		//str_concatenate("anurag","reddy");
		//checkingTwoStringsAreEqualInTheSameLengthAndContainTheSameCharactersInTheSamePositions(one, two);
		//checkingTwoStringsAreEqualInTheSameLengthAndContainTheSameCharactersInTheSamePositions("anurag", "reddy");
		ContainTheSameCharactersInTheSamePositions(one, two);
		ContainTheSameCharactersInTheSamePositions("anurag", "anurag");
		ContainTheSameCharactersInTheSamePositions("anurag", "anu");
		ContainTheSameCharactersInTheSamePositions("", "anu");
		ContainTheSameCharactersInTheSamePositions("", "");
		ContainTheSameCharactersInTheSamePositions("a", "b");
		createANewStringObjectWithTheContentsOfAStringArray(array);
	}
	public static void str_concatenate(String a, String b) {
		System.out.println(b+a);
	}
	public static void checkingTwoStringsAreEqualInTheSameLengthAndContainTheSameCharactersInTheSamePositions(String Str_one,String Str_two) {
		if (Str_one.length()==Str_two.length()) {
			System.out.println("Two strings are equal in length");
		}else System.out.println("Two strings are not equal in length");
	}
	public static void ContainTheSameCharactersInTheSamePositions(String Str_one,String Str_two) {
		if (Str_one.length()==Str_two.length()) {
			System.out.println("Both strings are equal in length");
		}
		for (int i = 0; i < Str_one.length(); i++) {
			if (Str_one.charAt(i)==Str_two.charAt(i)) {
				System.out.println(Str_one.charAt(i)+" ---Same characters in the same positions");
			}
			
		}
	}
	public static void createANewStringObjectWithTheContentsOfAStringArray (String [] array) {
		String newstring ="";
		for (int i = 0; i < array.length; i++) {
			newstring=newstring+array[i];
		}System.out.println(newstring);
	}
	
}

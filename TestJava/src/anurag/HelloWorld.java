package anurag;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Hello World");
 String my_str = "1-30";
 int a=1;
 int b=2;
sum_int(a,b);
int sum= sum_int(a,b);
 function();
	}
	public static void function () {
	 System.out.println("i am in function");
	 function1("a");
}
	public static void function1 (String my_str) {
		 System.out.println("i am in function 1");
		 //System.out.println(my_str);
	}
	public static int sum_int (int x,int y) {
		 System.out.println(x+y);
		return x+y;	
	}

}

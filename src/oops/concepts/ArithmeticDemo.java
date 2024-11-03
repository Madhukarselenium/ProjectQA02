package oops.concepts;

public class ArithmeticDemo {
	static int result;
	//Method-1: To perform addition operation
	public static void sumOf() {
		int a= 10;
		int b = 20;
		result= a + b;
		System.out.println("Sum of the given numbers is: "+result);
	}
	
	//Method-2: To perform multiplication
	public static void multiOf() {
		System.out.println(result);
		int x= 5;
		int y= 9;
		result= x * y;
		System.out.println("Multiplication of given numbers is: "+result);
	}
	

	public static void main(String[] args) {
		sumOf();
		multiOf();

	}

}

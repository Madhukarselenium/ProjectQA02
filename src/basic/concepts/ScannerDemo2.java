package basic.concepts;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		//write program to find sum of given any 2 numbers during runtime
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1= sc.nextInt();
		
		System.out.println("Enter your second number");
		int num2= sc.nextInt();
		sc.close();
		System.out.println("Sum of the given numbers is: "+(num1+num2));
	}

}

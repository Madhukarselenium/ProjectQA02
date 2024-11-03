package basic.concepts;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any name");
		String str= sc.nextLine();
		System.out.println("Enter any number");
		int myVal= sc.nextInt();
		
		System.out.println("Entered name is: "+str);
		System.out.println("Entered number is: "+myVal);
		
		sc.close();
		
	//	Ex: write program to find sum of given any 2 numbers during runtime

	}

}

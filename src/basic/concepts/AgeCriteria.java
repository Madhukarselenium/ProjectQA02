package basic.concepts;

import java.util.Scanner;

public class AgeCriteria {

	public static void main(String[] args) {
		//To read person Age
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Age:");
		int age=sc.nextInt();
		
		// age < 18 -->Minor, age between 18 to 60-->eligible other that sr.citizen
		
		if(age < 18) {
			System.out.println("He is Minor, not eligible to work");
		}
		else if ( (age >= 18) && (age<= 60 )) {
			System.out.println("He is Eligible to work");
		}
		else {
			System.out.println("He is not eligible to work");
		}
		
	

	}

}

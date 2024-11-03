package basic.concepts;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
//	1) Declare an array to store 3 string values
		String[] myCars = new String[3];
//	2) insert values into array
		myCars[0]="Benz";
		myCars[1]="Audi";
		myCars[2]="Bmw";

//	5) read multiple values from an array
	for(String myCar : myCars) {
		System.out.println(myCar);
	}


	}

}

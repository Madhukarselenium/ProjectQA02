package basic.concepts;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		int a[] = {1, 4, 40, 50};
		int b[]= {1, 40, 4, 50};
		if(Arrays.equals(a, b)) {
			System.out.println("Both the arrays are equal");
		}
		else {
			System.out.println("Both the arrays are not equals");
		}


		
	}

}

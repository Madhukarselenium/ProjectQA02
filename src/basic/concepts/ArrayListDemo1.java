package basic.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		//ArrayList Declaration
		List<String> myCars= new ArrayList<String>();
		//To assign values
		myCars.add("Benz");
		myCars.add("Bmw");
		myCars.add("Audi");
		
		System.out.println(myCars.get(0));
		

	}

}

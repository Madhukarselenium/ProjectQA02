package basic.concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		//Adding Data
		hm.put(101, "MadhukarQAIT");
		hm.put(102, "Mindq");
		hm.put(103, "Nellore");
		
		//To read all the values
		System.out.println(hm);
		
		//To find number of pair of values
		System.out.println(hm.size());
		
		//To read specific value
		System.out.println(hm.get(101));
				
		//To read only keys
		System.out.println(hm.keySet());
		
		//To read all the values
		for(Integer key : hm.keySet()) {
			System.out.println(hm.get(key));
		}
				
		
		
		
		
		
		
		
	}

}

package basic.concepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date dt= new Date();
		System.out.println(dt);
		
		//To convert System date
		DateFormat df= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		System.out.println(df.format(dt));

	}

}

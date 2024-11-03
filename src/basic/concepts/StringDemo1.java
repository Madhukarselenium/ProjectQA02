package basic.concepts;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "Mindqsystems";
		
		//To read "systems"
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,12 ));
		
		//To read "Mindq"
		System.out.println(str.substring(0, 5));
		
		
	}

}

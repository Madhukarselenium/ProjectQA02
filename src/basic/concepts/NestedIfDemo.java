package basic.concepts;

public class NestedIfDemo {

	public static void main(String[] args) {
		//To find smaller value in given 3 numbers
		int a = 30;
		int b = 20;
		int c = 10;
		
		if( (a < b) && (a< c)) {
			System.out.println("a- having smaller value");
		}
		else if (b < c) {
			System.out.println("b- having smaller value");
		}
		else {
			System.out.println("c- having smaller value");
		}

	}

}

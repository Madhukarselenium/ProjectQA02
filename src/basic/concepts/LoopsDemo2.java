package basic.concepts;

public class LoopsDemo2 {

	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.println(n);
			if(n==3) {
				break;
			}
			n++;
		}while(n<= 5);
		System.out.println("Demo for Loops");


	}

}

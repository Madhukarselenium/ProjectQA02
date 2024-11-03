package basic.concepts;

import java.util.Scanner;

public class StGradeDemo {

	public static void main(String[] args) {
		int stMarks;
		String stGrade="";
		
		//To read student marks
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student marks");
		stMarks=sc.nextInt();
		sc.close();
		
		if(stMarks >= 90) {
			stGrade="A";
		}
		else if(stMarks >= 80) {
			stGrade="B";
		}
		else if(stMarks >= 70) {
			stGrade="C";
		}
		else {
			stGrade="D";
		}
		
		System.out.println("Student marks are: "+stMarks);
		System.out.println("Student grade is: "+stGrade);
	}

}

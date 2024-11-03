package basic.concepts;

public class TwoDArray {

	public static void main(String[] args) {
		
		Object[][] myValues= new Object[3][2];
		
		//To assign values
		myValues[0][0]=100;
		myValues[0][1]= 200;
		
		myValues[1][0]="Mindq";
		myValues[1][1]= "Sr Nagar";
		
		myValues[2][0]=true;
		myValues[2][1]= false;
		
		
		
		for(int i = 0; i<= myValues.length-1; i++) {
			for(int j= 0; j<= myValues[i].length-1; j++) {
				System.out.println(myValues[i][j]);
			}
		}
		
		
		
		
		
		
		

	}

}

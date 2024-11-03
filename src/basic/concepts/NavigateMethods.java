package basic.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		//To initialize Browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");  //FB
		driver.manage().window().maximize();
		
		//to open Google using navigate().to():
		driver.navigate().to("https://google.co.in");  //Google
		
		//To move back
		driver.navigate().back();  //FB
		
		//To move fprward
		driver.navigate().forward();  //Google
	

	}

}

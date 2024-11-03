package basic.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserIntCmds1 {

	public static void main(String[] args) {
		//To launch Chrome Browser
		WebDriver driver= new ChromeDriver();
		
		//To open FB appln
		driver.get("https://facebook.com");
		
		//To maximize Browser window
		driver.manage().window().maximize();
		
		//To read page source code
		String pgSrc=driver.getPageSource();
		System.out.println(pgSrc);
		
		//To close 
		driver.quit();
		

	}

}

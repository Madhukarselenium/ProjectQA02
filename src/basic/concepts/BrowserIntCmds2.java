package basic.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserIntCmds2 {

	public static void main(String[] args) {
			//To initialize Browser
			WebDriver driver= new ChromeDriver();
			driver.get("https://facebook.com");
			driver.manage().window().maximize();
			
			//To read page title
			String pgTitle=driver.getTitle();
			System.out.println("Page title is: "+pgTitle);
			
			//To read page Url
			String pgUrl= driver.getCurrentUrl();
			System.out.println("Page Url is: "+pgUrl);
			
			
			
			
			

	}

}

package basic.concepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFLoginTest {

	public static void main(String[] args) {
		//step 1: Launch Browser 
		WebDriver driver= new ChromeDriver();
		//Step 2: navigate Url
		driver.get("https://login.salesforce.com");
		//step 3: maximize browser window
		driver.manage().window().maximize();
		
		//Step 4: enter "Mindqsystems" in "username" editbox
		driver.findElement(By.id("username")).sendKeys("Mindqsystems");
		//Step 5: enter "Sr Nagar" in pwd editbox
		driver.findElement(By.id("password")).sendKeys("Sr Nagar");
		//Step 6: click on "Login"
		driver.findElement(By.id("Login")).click();


	}

}

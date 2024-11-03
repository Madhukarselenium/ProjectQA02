package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTLoginTest {

	public static void main(String[] args) {
		//To Initialize the Browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		//To perform login operation
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mercury");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	
						
						
						
						
						

	}

}

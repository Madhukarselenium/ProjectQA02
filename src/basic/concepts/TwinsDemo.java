package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwinsDemo {

	public static void main(String[] args) {
		// To Initialize the Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://obstaclecourse.tricentis.com/Obstacles/12952/retry");
		driver.manage().window().maximize();
		
		//Clicks on the button labeled 'I am the one' - the second one, on the right hand side..
		driver.findElement(By.xpath("//div[@id='thisoneistheright']/p/a")).click();
	}

}

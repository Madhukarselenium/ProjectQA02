package basic.concepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTLoginTest2 {

	public static void main(String[] args) throws InterruptedException {
		//To read user login credentials
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username");
		String uid= sc.nextLine();
		System.out.println("Enter password");
		String pwd= sc.nextLine();
		sc.close();
		
		//To Initialize the Browser
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		//To perform login operation
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		
		//To pause the execution
		Thread.sleep(4000);
		
		//To read page title
		String pgTitle= driver.getTitle();
		
		//VErify login successful or not
		//Compare page title
		
		
		if(pgTitle.equals("Login: Mercury Tours"))
		{
			System.out.println("Successful login operation");
		}
		else {
			System.out.println("Unsuccessful login operation");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

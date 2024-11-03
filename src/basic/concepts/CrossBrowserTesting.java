package basic.concepts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		String testBrowser="";
		WebDriver driver=null;
		//To read browser name
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required Browser name");
		testBrowser= sc.nextLine();
		sc.close();
		
		switch (testBrowser.toLowerCase())
		{
		case "chrome":
			driver= new ChromeDriver();
			System.out.println("Chrome Browser launched");
			break;
		case "firefox":
			driver= new FirefoxDriver();
			System.out.println("Firefox Browser launched");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("Edge Browser launched");
			break;
		default:
			System.out.println("Invalid Entity");
			System.exit(0);
		}
		
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
				
		
		

	}

}

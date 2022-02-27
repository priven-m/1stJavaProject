package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set variable
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//instance of chrome drive
		WebDriver driver = new ChromeDriver();
		
		//url
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
		//maximize window
		driver.manage().window().maximize();
		
		//Click on Flights link
		driver.findElement(By.cssSelector("a[href='reservation.php']")).click();
		
		driver.findElement(By.cssSelector("name['tripType']value['oneway']"));
		
	}

}

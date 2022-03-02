package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//url
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		
		//locate using xpath
		WebElement oneWayRb = driver.findElement(By.xpath("//input[@type='radio'][@value='oneway']"));
		
		oneWayRb.click();
		System.out.println("One way radio Button clicked");
		Thread.sleep(100);
		
		//Select the dropdown using name
		Select select = new Select(driver.findElement(By.name("fromPort")));
		
		//print options in select dropdown
		List<WebElement>lst= select.getOptions();
		
		//Loopin through options
		for (WebElement options:lst)
			System.out.println(options.getText());
		
		//select the option
		select.selectByVisibleText("London");
		System.out.println(select.getFirstSelectedOption().getText());
		
		//locate using xpath
		WebElement firstClassRb = driver.findElement(By.xpath("//input[@name='servClass'][@value='First']"));
				
		firstClassRb.click();
		System.out.println("First Class radio Button clicked");
		
		//Click continue
		driver.findElement(By.name("findFlights")).click();
		System.out.println("Form submitted");
		
		driver.close();
		              

	}

}

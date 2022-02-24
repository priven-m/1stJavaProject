package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set variables
		//String BaseUrl = "https://demoqa.com/";
		String practiceUrl = "https://demoqa.com/automation-practice-form";
		String guruUrl = "https://demo.guru99.com/test/newtours/";
		
		driver.get(practiceUrl);
		
		//locating attribute by id
		driver.findElement(By.id("firstName"));
		
		//locating attributing by name
		driver.findElement(By.name("gender"));
		
		// locate using class
		driver.findElement(By.className("practice-form-wrapper"));
		
		//locate using css selector
		driver.findElement(By.cssSelector("input[id='firstName']"));
		
		//locate using xpath
		driver.findElement(By.xpath("//input[@id='firstName']"));
				
		//locate using link text
		driver.get(guruUrl);
		driver.findElement(By.linkText("SUPPORT"));
		driver.findElement(By.partialLinkText("SUP"));
		
		driver.close();
	}

}

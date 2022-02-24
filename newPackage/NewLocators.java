package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//url variable
		String demoqa = "https://demoqa.com/automation-practice-form";
		String guruUrl = "https://demo.guru99.com/test/newtours/";
		
		//navigate to url
		driver.get(demoqa);
		
		WebElement firstName = driver.findElement(By.id("lastName"));
		boolean isDisplayedfirstName = firstName.isDisplayed();
		boolean isEnabledfirstName = firstName.isEnabled();
		System.out.println(isDisplayedfirstName + " " + isEnabledfirstName);
		
		//find email using css
		driver.findElement(By.cssSelector("input[id='userEmail']"));
		
		//find email using xpath
		driver.findElement(By.xpath("//input[@id='lastName']"));
		
		//find left pane using class
		driver.findElement(By.className("left-pannel"));
		
		driver.get(guruUrl);
		
		//find last name use name
		driver.findElement(By.name("userName"));
		
		//find email using linktext
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		//find email using partial linktext
				driver.findElement(By.partialLinkText("SIG"));
		
		driver.close();
		
		System.out.println("All locators found from demoqa");
		System.out.println("All locators found from guru99");
	}

}

package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate chrome drive
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Variable Strings
		String BaseUrl = "https://demo.guru99.com/test/login.html";
		String siteTitle = "Login Page";
		String returnedTitle = "";
		
		//navigate to url
		driver.get(BaseUrl);
		
		//get the actual value of the title
		returnedTitle = driver.getTitle();
		
		//compare title returned is the siteTitle
		if (siteTitle.contentEquals(returnedTitle)) {
			System.out.println("Correct title returned");
		}else {
			System.out.println("Title incorrect");
		}
		//enter email address and password
		driver.findElement(By.id("email")).sendKeys("pm@gmail.com");;
		driver.findElement(By.name("passwd")).sendKeys("12345");
		
		//Click on Sign in button
		driver.findElement(By.name("SubmitLogin")).submit();;
		
		//Verify if user is successfully logged in using ClassName
		driver.findElement(By.className("error-copy"));
		System.out.println("login test passed");
				
		driver.close();
	}

}

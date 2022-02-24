package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set variables
		String BaseUrl = "https://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//navigate to base url
		driver.get(BaseUrl);
		
		//get the actual value of the title
		actualTitle = driver.getTitle();
		
		//compare title and print result as passed or failed
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
	}

}

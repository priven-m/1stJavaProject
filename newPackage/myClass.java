package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration and instantiation of objects and variables
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch chrome and direct to base Url
		String BaseUrl = "https://demo.guru99.com/test/newtours/";
		driver.get(BaseUrl);
		
	}

}

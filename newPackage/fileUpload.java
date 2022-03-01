package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set variables
		//String BaseUrl = "https://demoqa.com/";
		String monsterUrl = "http://monsterindia.com/seeker/registration";
		
		driver.manage().window().maximize();
		driver.get(monsterUrl);
		
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		browse.sendKeys("C:\\Users\\User\\Documents\\Inspired Testing\\excercise.docx");
		System.out.println("File uploaded successfully");
		
	}

}

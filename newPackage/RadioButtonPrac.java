package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPrac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set variable
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//instance of chrome drive
		WebDriver driver = new ChromeDriver();
		
		//url
		driver.get("http://demo.guru99.com/test/radio.html");
		
		//element locator for radio button
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

		//Click 1
		radio1.click();
		System.out.println("radio button 1 clicked");
		Thread.sleep(100);
		
		//Click 2
		radio2.click();
		System.out.println("radio button 2 clicked");
		Thread.sleep(100);
		
		//toggle
		radio1.click();
		System.out.println("radio button 1 clicked");
		Thread.sleep(100);
		
		//locate check box
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));
		
		//check option 1
		option1.click();
		option2.click();
		
		//Check if check box is ticked
		if(option1.isSelected()) {
			System.out.println("CheckBx is selected");
		}else {
				System.out.println("CheckBx is not selected");
				
		driver.close();
		}
	}
}
		
	



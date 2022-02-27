package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set variable
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//instance of chrome drive
		WebDriver driver = new ChromeDriver();
		
		//url
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Validate isSelected and click
		WebElement chkBxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1'][class='custom-control-label']"));
		boolean isSelected = chkBxSelected.isSelected();
		
		//click, if is not selected
		if (isSelected == false) {
		chkBxSelected.click();
		}
		
		Thread.sleep(10);
		//Validate isDisplayed and click
		WebElement chkbxDisplayed = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-2'][class='custom-control-labe2']"));
		boolean isDisplayed = chkbxDisplayed.isDisplayed();
		
		//click, if it is displayed
		if (isDisplayed == true) {
			chkbxDisplayed.click();
		}
		Thread.sleep(10);
					
		//Validate isEnabled and click
		WebElement chkBxEnabled = driver.findElement(By.cssSelector("input[id='hobbies-checkbox-3'][class='custom-control-labe3']"));
		boolean isEnabled = chkBxEnabled.isSelected();
			
		//click, if is not selected
		if (isEnabled == true) {
			chkBxEnabled.click();
		}Thread.sleep(10);
		}
	}


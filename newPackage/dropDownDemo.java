package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set variable
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		//instance of chrome drive
		WebDriver driver = new ChromeDriver();
		
		//url
		driver.get("https://demoqa.com/select-menu");
		
		//maximize window
		driver.manage().window().maximize();
		
		//Select the dropdown using id
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		
		//print options in select dropdown
		List<WebElement>lst=select.getOptions();
		
		//Loopin through options and print dropdown options
		System.out.println("The dropdown options are: ");
		for (WebElement options:lst)
			System.out.println(options.getText());
		
		//select the option as purpple index
		select.selectByIndex(4);
		System.out.println("selected value is:" + select.getFirstSelectedOption().getText());
		
		//select option2. magenta using visible text
		select.selectByVisibleText("Magenta");
		System.out.println("the colour is: " + select.getFirstSelectedOption().getText());
	}

}

package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//displays in HTML in a structure form using rows and columns
		
		// <table> html tag
		// <th> table header
		// <tr> tables row
		// <td> table columns
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//set variables
		//String BaseUrl = "https://demoqa.com/";
//		String baseUrl = "http://demo.guru99.com/test/web-table-element.php";
//		
//		driver.get(baseUrl);
		
		//No.of Columns
//		String col11 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[1]/th[1]")).getText();
//		System.out.println(col11);
//		List <WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
//		System.out.println("No of cols are : " +col.size());
//		//No.of rows
//		List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
//		System.out.println("No of rows are : " + rows.size());
//		String col12 = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr[4]/th[3]")).getText();
//		System.out.println(col12);
		
		String baseUrl = "http://demo.guru99.com/test/table.html";
		
		driver.get(baseUrl);
		
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		List <WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		
		int row_count = rows_table.size();
		
		for (int row = 0; row< row_count; row++) {
			List <WebElement> columns_row = rows_table.get(row).findElements(By.tagName("td"));
			//to calculate no of columns in row
			int columns_count = columns_row.size();
			System.out.println("Number of colls in row " + row + " are " + columns_count);
			
			//loop will execute till the cell of that row
			for(int colm = 0; colm < columns_count ; colm++) {
				//retrieve the text from that specific cell
				String celText = columns_row.get(colm).getText();
				System.out.println("Cell Value of row number " + row + " and column num " + colm + " is " + celText);
			}
		}
		
		
		
	}

}

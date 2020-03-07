package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	public static void main(String[] args) {
		
		System.setProperty
		("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//To Load the url
		driver.get("https://erail.in/");
		//To maximize the browser
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int size = rows.size();
		System.out.println("row size "+size);
		
		for (int i = 0; i < size; i++) {
			WebElement firstRow = rows.get(i);
			List<WebElement> firstRowCols = firstRow.findElements(By.tagName("td"));
			System.out.println(firstRowCols.size());
			System.out.println(firstRowCols.get(1).getText());
		}
		
		
		
		
		
		
		
		
	}

}

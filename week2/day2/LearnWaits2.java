package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits2 {
	public static void main(String[] args) {
		//Set the chromedriver.exe file to the java class
				System.setProperty
				("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//Launching Chrome Browser
				ChromeDriver driver = new ChromeDriver();
				//To Load the url
				driver.get("http://leafground.com/pages/appear.html");
				//To maximize the browser
				driver.manage().window().maximize();
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				To create an object for WebDriverWait
				WebDriverWait wait = new WebDriverWait(driver, 10);
//				Creating a wait for a particular Condition
				wait.until(ExpectedConditions
						.visibilityOf(driver.findElementById("btn")));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}

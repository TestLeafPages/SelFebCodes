package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable {

	public static void main(String[] args) throws InterruptedException  {
		//Set the chromedriver.exe file to the java class
		System.setProperty
		("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//To Load the url
		driver.get("http://leafground.com/pages/drag.html");
		//To maximize the browser
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement eleDraggable = driver.findElementById("draggable1");
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(eleDraggable, 50, 50).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

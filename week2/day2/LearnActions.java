package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		//Set the chromedriver.exe file to the java class
		System.setProperty
		("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//To Load the url
		driver.get("https://www.flipkart.com/");
		//To maximize the browser
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement eleElectronics = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(eleElectronics).perform();
		
		driver.findElementByLinkText("Mi").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

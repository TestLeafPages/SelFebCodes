package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		//Set the chromedriver.exe file to the java class
		System.setProperty
		("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//To Load the url
		driver.get("http://leaftaps.com/opentaps");
		//To maximize the browser
		driver.manage().window().maximize();
		//To locate the element and enter the value
		driver.findElementById("username").sendKeys("Demosalesmanager");
		String typedText = driver.findElementById("username").getAttribute("value");
		Thread.sleep(5000);
		driver.findElementById("password").sendKeys("crmsfa",Keys.ENTER);
		//To locate the element and click on it
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		//To Close the browser
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

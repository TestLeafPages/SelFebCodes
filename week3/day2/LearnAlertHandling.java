package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
//		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.sendKeys("TestLeaf Software Solutions");
		System.out.println(alertText);
		Thread.sleep(2000);
		alert.accept();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
	}

}

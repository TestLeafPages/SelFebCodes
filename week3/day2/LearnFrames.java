package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
//		Switch to a frame
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
//		To come outta frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1); // Parent frame
		driver.switchTo().frame("frame2");
		driver.findElementById("Click1").click();
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

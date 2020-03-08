package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		driver.findElementByLinkText("Try it Yourself »").click();
		
//		Window Handling Code
		Set<String> winSet = driver.getWindowHandles();
		List<String> winLis	= new ArrayList<String>(winSet);
		driver.switchTo().window(winLis.get(1));
		
//		To take a screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/snap1.png");
		FileUtils.copyFile(src, dst);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

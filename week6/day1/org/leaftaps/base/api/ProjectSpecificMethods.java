package week6.day1.org.leaftaps.base.api;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readExcel.ReadExcel;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;

	@Parameters({"url", "uname", "pwd"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(pwd);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	// for dataProvider
	@DataProvider
	public String[][] getData() throws IOException {		
		ReadExcel data = new ReadExcel();
		return data.readExcel();
		
	}
	
	
	/*
	 * String[][] data = new String[2][4];
	 *  
	 * data[0][0] = "TestLeaf"; 
	 * data[0][1] = "Sarath";
	 * data[0][2] = "K";
	 * data[0][3] = "12345";
	 * data[1][0] = "TL";
	 * data[1][1] = "Babu"; 
	 * data[1][2] = "M"; 
	 * data[1][3] = "45678";
	 * 
	 * return data;		 */

}

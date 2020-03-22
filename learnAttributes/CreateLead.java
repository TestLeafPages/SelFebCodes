package learnAttributes;

import java.util.concurrent.TimeUnit;

import org.leaftaps.base.api.ProjectSpecificMethods;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead{
	// (invocationCount = 2)
	// (invocationCount = 2, threadPoolSize = 1)
	// (invocationCount = 2, invocationTimeOut = 50000)
	// (invocationCount = 2, timeOut = 30000)
	// (priority = 0)
	// (dependsOnMethods = {"creatLead"}, alwaysRun = true)
	// (enabled = true)
	// (expectedExceptions = {Exception.class})
	// (successPercentage = 80)

	@Test(enabled = true)
	public void createLead() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(50000);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();	
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9597704568");
		driver.findElementByName("submitButton").click();
		driver.close();
	}
}







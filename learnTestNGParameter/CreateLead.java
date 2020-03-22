package learnTestNGParameter;

import org.leaftaps.base.api.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

	@Test
	public void createLead() throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9597704568");
		driver.findElementByName("submitButton").click();
		
	}
}







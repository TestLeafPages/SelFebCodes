package week6.day1.learnTestNGParameter;

import org.leaftaps.base.api.ProjectSpecificMethods;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethods{

	@Test(dataProvider = "getData")
	public void createLead(String cName, String fName, String lName, String ph) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(ph);
		driver.findElementByName("submitButton").click();
		
	}
}







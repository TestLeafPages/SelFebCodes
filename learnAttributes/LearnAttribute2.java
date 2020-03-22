package learnAttributes;

import org.testng.annotations.Test;

public class LearnAttribute2 {
	
	@Test(expectedExceptions = {Exception.class})
	public void creatLead() {
		System.out.println("createLead");
		throw new RuntimeException();
	} 	
	
	@Test
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	
	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}
	
	@Test
	public void editLead() {
		System.out.println("editLead");
	}

}

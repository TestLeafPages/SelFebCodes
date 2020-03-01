package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		//Set the chromedriver.exe file to the java class
		System.setProperty
		("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Launching Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		//To Load the url
		driver.get("http://leafground.com/pages/Dropdown.html");
		//To maximize the browser
		driver.manage().window().maximize();
		// Find the dropdown
		WebElement eleDropdown = driver
				.findElementById("dropdown116");
		//Convert it into a dropdown
		Select dropdown = new Select(eleDropdown);
		//To get all the options in the dropdown
		List<WebElement> options = dropdown.getOptions();
		//To get the size of the List
		int size = options.size();
		System.out.println(size);
		//To select the last
		dropdown.selectByIndex(size-1);
		
		//To print all the items from the dropdown
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
		}
		/*Select using Index
		dropdown.selectByIndex(3);*/
		/*Select using value attribute
		dropdown.selectByValue("2");*/
		/*Select using Visible Text 
		 *dropdown.selectByVisibleText("Loadrunner");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package myrealtime1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementByName("userRegistrationForm:userName").sendKeys("sankar");
		driver.findElementByName("userRegistrationForm:password").sendKeys("Sankar@14");
		driver.findElementByName("userRegistrationForm:confpasword").sendKeys("Sankar@14");
		
		WebElement securityquestion = driver.findElementById("userRegistrationForm:securityQ");
		Select sl = new Select(securityquestion);
		sl.selectByIndex(5);
		
		
	}

}

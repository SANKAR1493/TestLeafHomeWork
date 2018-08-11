package myrealtime1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryLevel1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementByName("userRegistrationForm:userName").sendKeys("sankar");
		driver.findElementByName("userRegistrationForm:password").sendKeys("Sankar@14");
		driver.findElementByName("userRegistrationForm:confpasword").sendKeys("Sankar@14");
		driver.findElementByName("userRegistrationForm:securityQ").sendKeys("what is your all time favorite sports team");
		driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("INDIA");
		driver.findElementByName("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sankar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("N");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("14");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("JUN");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1993");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789123");
		driver.findElementById("userRegistrationForm:idno").sendKeys("EZJPS4393L");
		driver.findElementById("userRegistrationForm:countries").sendKeys("india");
		driver.findElementById("userRegistrationForm:email").sendKeys("sankar141993@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9445031558");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("india");
		driver.findElementById("userRegistrationForm:address").sendKeys("58");
		driver.findElementById("userRegistrationForm:street").sendKeys("Perumal Mudali Street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Royapettah");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600014",Keys.TAB);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("TamilNadu",Keys.TAB);
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Royapettah");
		Thread.sleep(5000);	
		driver.findElementById("userRegistrationForm:landline").sendKeys("04562245300");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		//driver.findElementById("nlpAnswer").sendKeys("captcha value");
		driver.findElementById("userRegistrationForm:newsletter:0").click();
		driver.findElementById("userRegistrationForm:commercialpromo:0").click();
		driver.findElementById("userRegistrationForm:irctcsbicard:1").click();
		driver.findElementById("userRegistrationForm").click();
	}

}

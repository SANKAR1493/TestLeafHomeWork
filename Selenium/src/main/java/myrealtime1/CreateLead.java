package myrealtime1;

//import java.util.ArrayList;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*String baseUrl = "http://www.google.com";
        // launch  and direct it to the Base URL
        driver.get(baseUrl);*/
		
		//driver.navigate().to("http://www.google.com");
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();		
		driver.findElementById("createLeadForm_companyName").sendKeys("TEAMLEAD");
		driver.findElementById("createLeadForm_firstName").sendKeys("SANKAR");
		driver.findElementById("createLeadForm_lastName").sendKeys("N");
		
		
		//drop down
		
		WebElement ele= driver.findElementById("createLeadForm_dataSourceId");
		
		Select sel = new Select(ele);
		sel.selectByVisibleText("Cold Call");
		//WebElement clearEle = driver.findElementByName("primaryPhoneCountryCode");
		//clearEle.clear();
		
		/*List<WebElement> allOptions = sel.getOptions();
		
		int count = allOptions.size();
		System.out.println(count);
		
		for(WebElement each :allOptions)
			System.out.println(each.getText());
		sel.selectByIndex(4);*/
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElementByClassName("smallSubmit").click();
		//driver.findElementByLinkText("Logout").click();
		
	}

}

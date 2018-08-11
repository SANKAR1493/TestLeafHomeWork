package myrealtime1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		//firstName
        driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("SANKAR");
        driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("N");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]").click();
        driver.findElementByLinkText("Edit").click();
        driver.findElementById("updateLeadForm_companyName").clear();
        driver.findElementById("updateLeadForm_companyName").sendKeys("Test Maker");
       WebElement ele1 = driver.findElementById("updateLeadForm_industryEnumId");
       Select industryname = new Select(ele1);
       industryname.getOptions();
      
      // industryname.selectByVisibleText("Aerospace");
       industryname.selectByIndex(1);
       WebElement ele2 = driver.findElementById("updateLeadForm_ownershipEnumId");
       Select ownershipname=new Select(ele2);     
    	ownershipname.selectByIndex(2);	    
      //use click(); or submit();
      driver.findElementByName("submitButton").click();
      driver.close();
      
      
       
        
        
        
        		
        		
        		

		
		
		

	}

}

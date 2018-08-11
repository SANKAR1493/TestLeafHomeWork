package myrealtime1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TryLevel2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("SANKAR");
		driver.findElementById("parentPartyId").sendKeys("");
		driver.findElementById("groupNameLocal").sendKeys("");
		driver.findElementById("officeSiteName").sendKeys("");
		driver.findElementById("annualRevenue").sendKeys("200000");
		driver.findElementById("currencyUomId").sendKeys("INR-Indian Rupee");
		driver.findElementByClassName("industryEnumId").sendKeys("Computer Software");
		driver.findElementById("numberEmployees").sendKeys(" ");
		driver.findElementByClassName("ownershipEnumId").sendKeys("LLC/LLP");
		driver.findElementByClassName("sicCode").sendKeys("");
		driver.findElementById("tickerSymbol").sendKeys("");
		driver.findElementByClassName("dataSourceId").sendKeys("Partner");
		driver.findElementById("marketingCampaignId").sendKeys("Demo Marketing Campaign");
		driver.findElementByClassName("initialTeamPartyId").sendKeys("Demo Sales Team No. 1");
		driver.findElementByClassName("description").sendKeys("");
		driver.findElementByClassName("importantNote").sendKeys("");
		driver.findElementById("primaryPhoneCountryCode").sendKeys("+91");
		driver.findElementById("primaryPhoneAreaCode").sendKeys("");
		driver.findElementById("primaryPhoneNumber").sendKeys("04562245300");
		driver.findElementById("primaryPhoneExtension").sendKeys("");
		driver.findElementById("primaryPhoneAskForName").sendKeys("");
		driver.findElementById("primaryEmail").sendKeys("");
		driver.findElementById("primaryWebUrl").sendKeys("");
		driver.findElementById("generalToName").sendKeys("");
		driver.findElementById("generalAttnName").sendKeys("");
		driver.findElementById("generalAddress1").sendKeys("58,Perumal Mudali Street");
		driver.findElementById("generalAddress2").sendKeys("Royapettah");
		driver.findElementById("generalCity").sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElementById("generalCountryGeoId").sendKeys("India");
		driver.findElementById("generalPostalCode").sendKeys("600014");
		Thread.sleep(3000);
		driver.findElementById("generalStateProvinceGeoId").sendKeys("TamilNadu");
		driver.findElementById("generalPostalCodeExt").sendKeys("");



	}	

}

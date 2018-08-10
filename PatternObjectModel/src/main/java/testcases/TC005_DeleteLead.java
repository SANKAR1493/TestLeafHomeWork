package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC005";
		testDescription = "click to deletelead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sankar";
		dataSheetName  = "TC005";
}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String phoneno) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin().crmlink().clickleads().clickfindlead().clkPhoneno().typePhoneno(phoneno)
		.clkfindleads().clickfirstlead().clickdeletelead();
		}
}

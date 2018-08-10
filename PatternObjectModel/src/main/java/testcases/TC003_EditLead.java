package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "click to editlead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sankar";
		dataSheetName  = "TC003";
	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String ffname,String flname,String updatecname) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin().crmlink().clickleads().clickfindlead().typeffname(ffname).typeflname(flname).clkfindleads()
		.clickfirstlead().clickeditlead().typeupdatecname(updatecname).clickupdateleadform().verifycname(updatecname);
	}
}
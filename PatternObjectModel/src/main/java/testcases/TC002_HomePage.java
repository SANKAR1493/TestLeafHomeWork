package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_HomePage extends ProjectMethods {
	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC002";
		testDescription = "click to createlead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sankar";
		dataSheetName  = "TC002";

	}
	@Test(dataProvider="fetchData")
	public void login(String uName,String pwd,String companyname,String fname,String lname) {
		new LoginPage()
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin().crmlink()
		.createlead()
		.typeCompanyName(companyname).
		typeFirstName(fname)
		.typeLastName(lname)
		.clickcreate();
	}
}

package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods {
		
	@BeforeTest
		public void setData() {
			browserName = "chrome";
			testCaseName = "TC004";
			testDescription = "click to mergelead";
			testNodes = "Leads";
			category = "smoke";
			authors = "sankar";
			dataSheetName  = "TC004";
		}
		@Test(dataProvider="fetchData")
		public void login(String uName,String pwd,String fname,String lname,String secfirstname,String seclastname) {
			new LoginPage()
			.typeUserName(uName)
			.typePassword(pwd)
			.clickLogin().crmlink().clickleads().clickmergelead().clickfmergewindow()
			.typefirstname(fname).typelastname(lname).clickfindleads().clickfirstlead()
			.clicksecmergewindow().typesfirstname(secfirstname).typeslastname(seclastname).clicksfindleads().clicksfirstlead().clickMergeButton();
			}
}

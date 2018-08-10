package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{

	public MergeLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleclickfwindow;
	@Then("click the fromlead button")
	public MergeLead clickfmergewindow() {
		// eleUName = locateElement("username");
		click(eleclickfwindow);
		switchToWindow(1);
		return this;
	}

	/*public MergeLead actionSwitchToWindow(int index) {
		// eleUName = locateElement("username");
		switchToWindow(index);
		return this;
	}*/

	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement elefirstname;
	@Then("enter the ffirstname as (.*)")
	public MergeLead typefirstname(String data) {
		// eleUName = locateElement("username");
		type(elefirstname,data);		
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement elelastname;
	@Then("enter the flastname as (.*)")
	public MergeLead typelastname(String data) {
		// eleUName = locateElement("username");
		type(elelastname,data);		
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleads;
	@Then("click the merge findleads button")
	public MergeLead clickfindleads() {
		// eleUName = locateElement("username");
		click(elefindleads);		
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	private WebElement elefirstfind;
	@Then("click merge firstfind lead")
	public MergeLead clickfirstlead() {
		// eleUName = locateElement("username");
		click(elefirstfind);	
		switchToWindow(0);
		return this;
	}

	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleclicksecwindow;
	@Then("click the Tolead button")
	public MergeLead clicksecmergewindow() {
		click(eleclicksecwindow);
		switchToWindow(1);
		return this;
	}


	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement elesfirstname;
	@Then("enter the sfirstname as (.*)")
	public MergeLead typesfirstname(String data) {
		// eleUName = locateElement("username");
		type(elesfirstname,data);		
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@name='lastName']")
	private WebElement eleslastname;
	@Then("enter the slastname as (.*)")
	public MergeLead typeslastname(String data) {
		// eleUName = locateElement("username");
		type(eleslastname,data);		
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elesfindleads;
	@Then("click the mergefindleads button")
	public MergeLead clicksfindleads() {
		// eleUName = locateElement("username");
		click(elesfindleads);		
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[1]")
	private WebElement elesfirstfind;
	@Then("click firstfind lead")
	public MergeLead clicksfirstlead() {
		// eleUName = locateElement("username");
		click(elesfirstfind);
		switchToWindow(0);
		return this;
	}

	@FindBy(how=How.LINK_TEXT, using="Merge")
	private WebElement eleMergeButton;
	@Then("click the merge button")
	public void clickMergeButton() {
		click(eleMergeButton);
	}
}

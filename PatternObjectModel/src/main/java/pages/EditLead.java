package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead  extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefindfname;
	@Then ("enter fname as (.*)")
	public EditLead typeffname(String data) {
		type(elefindfname, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//input[@name='lastName'])[3]")
	private WebElement elefindlname;
	@Then ("enter lastname as (.*)")
	public EditLead typeflname(String data) {
		type(elefindlname, data);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhone;
	@Then("click phonelink")
	public EditLead clkPhoneno() {
		click(elePhone);
		return this;
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneno;
	@Then("enter phone as (.*)")
	public EditLead typePhoneno(String data) {
		type(elePhoneno, data);
		return this;
	}	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleads;
	@Then("click the findleads button")
	public EditLead clkfindleads() {
		click(elefindleads);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement elefirstlead;
	@When ("click first find lead")
	public UpdateLead clickfirstlead() {
		click(elefirstlead);
		return new UpdateLead();
	}
	
}


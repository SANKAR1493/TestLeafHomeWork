package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods {
 
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using = "Create Lead")
	private WebElement elecreatelead;
	@Then("click the createlead link")
	public CreateLead createlead() {
		click(elecreatelead);
		return new CreateLead(); 
	}
	
	@FindBy(how=How.LINK_TEXT,using ="Leads")
	private WebElement eleleads;
	@Then("click the leads")
	public MyLeads clickleads() {
		click(eleleads);
		return new MyLeads(); 
	}
}

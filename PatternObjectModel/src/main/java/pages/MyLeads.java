package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {

	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindlead;

	@When("click the find leads")
	public EditLead clickfindlead() {
		// eleUName = locateElement("username");
		click(elefindlead);		
		return new EditLead();
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;

	@When("click the merge leads")
	public MergeLead clickmergelead() {
		// eleUName = locateElement("username");
		click(elemergelead);		
		return new MergeLead();
	}
	
}

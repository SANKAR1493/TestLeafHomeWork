package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	@And("enter companyname as (.*)")
	public CreateLead typeCompanyName(String data) {
		// eleCompanyName = locateElement("companyName");
		type(eleCompanyName, data);		
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	@And("enter firstname as (.*)")
	public CreateLead typeFirstName(String data) {
		// eleFirstName = locateElement("firstName");
		type(eleFirstName, data);		
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;

	@And("enter lastname	as (.*)")
	public CreateLead typeLastName(String data) {
		// eleeleLastName = locateElement("firstName");
		type(eleLastName, data);		
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;

	@Then("click the createlead button")
	public ViewLead clickcreate() {
		
		click(eleSubmit);
		return new ViewLead();
			
		
	}
	
}

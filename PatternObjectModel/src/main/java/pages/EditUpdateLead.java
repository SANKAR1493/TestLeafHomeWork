package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class EditUpdateLead extends ProjectMethods{

	public EditUpdateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleupdatecname;
	@Then("enter coname as (.*)")
	public EditUpdateLead typeupdatecname(String data) {
		type(eleupdatecname,data);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleclickupdatecname;
	@Then("click the update button") 
	public ViewUpdateLead clickupdateleadform() {
		click(eleclickupdatecname);
		return new ViewUpdateLead();
	}
}

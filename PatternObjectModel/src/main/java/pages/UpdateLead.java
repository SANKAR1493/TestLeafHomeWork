package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class UpdateLead extends ProjectMethods {

	public UpdateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleedit;
	@Then("click edit button")
	public EditUpdateLead clickeditlead() {
		click(eleedit);
		return new EditUpdateLead();
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eledelete;
	@Then("click the delete button")
	public void clickdeletelead() {
		click(eledelete);
		
	}
}

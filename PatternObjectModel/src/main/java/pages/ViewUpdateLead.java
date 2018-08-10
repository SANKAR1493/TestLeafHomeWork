package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewUpdateLead extends ProjectMethods {

	public ViewUpdateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleviewupdatecname;
	public ViewUpdateLead verifycname(String updatecname) {
		verifyPartialText(eleviewupdatecname, updatecname);
		return this;
	}
}

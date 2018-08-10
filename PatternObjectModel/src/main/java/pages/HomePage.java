package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	/*@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogOut;

	public LoginPage clickLogOut() {
		click(eleLogOut);
		return new LoginPage();
	}*/
	
	@FindBy(how=How.LINK_TEXT,using = "CRM/SFA")
	private WebElement eleCRMSFA;
	@Then("click the crmlink")
	public MyHomePage crmlink() {
		click(eleCRMSFA);
		return new MyHomePage(); 
	}



}

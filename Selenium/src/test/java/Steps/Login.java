package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	/*public RemoteWebDriver driver;
	@Given ("Launch the browser")
	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}
	@And ("Load the URL")
	public void url() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And ("set implicitwait")
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And ("maximize the page")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@And ("enter username as (.*)")
	public void username(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And ("enter password as (.*)")
	public void password(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@When ("click the login button")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@But("verify the error") 
	public void verifyerror() {
		String text = driver.findElementById("errorDiv").getText();
		if (text.contains("The Following Errors Occurred:")) {
			System.out.println("error msg successfull");
		} else {
			System.out.println("error msg not successfull");
		}
	}
	@Then ("close the browser")
	public void closebrowser() {
		driver.close();
	}
*/

}


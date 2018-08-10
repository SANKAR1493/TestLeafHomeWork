package RunnerClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods{
	@Before
	public void before() {
		startResult();
		startTestModule("EditLead", "EditLead");	
		test = startTestCase("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("sankar");
		startApp("chrome");	
	}
	@After
	public void after() {
		
		closeAllBrowsers();
		endResult();
	}
}

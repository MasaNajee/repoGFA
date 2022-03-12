package tests;


import login.LoginActions;
import login.LoginAssertions;
import org.testng.annotations.*;

public class LoginTest extends BaseTest{
	LoginActions loginActions;
	LoginAssertions loginAssertions;
	
	@BeforeClass
	public void beforeClass() {
		loginActions = new LoginActions();
		loginAssertions = new LoginAssertions();
	}
	
	@Test
	public void loginToApp() throws InterruptedException {
		loginActions
		.typeInUserName("m.naji13")
		.clickNextButton()
		.typeInPassword("123")
		.clickLoginButton(); 
		System.out.println("Login Successfully");
		loginAssertions
		.verifyDashboard();
		System.out.println("Assertion Successfully");
	}
	

}

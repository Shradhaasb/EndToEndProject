package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepsTest extends BaseClass {

	public static LoginPage loginpage;

	@Given("UserisonLoginPageusing {string}")
	public void userison_login_pageusing(String browserName) {
		BaseClass.initialization(browserName);
	}

	@When("UserentersUsernameandPassword")
	public void userenters_usernameand_password() {
		loginpage = new LoginPage();

		String userName = prop.getProperty("USERNAME");
		String password = prop.getProperty("PASSWORD");

		loginpage.enterUserNameAndPass(userName, password);
	}

	@Then("UserclicksonLoginbutton")
	public void userclickson_loginbutton() {
		loginpage.clickOnLoginButton();
	}

	
}

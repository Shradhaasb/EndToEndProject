package StepDefination;

import org.junit.Assert;

import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStepsTest {
	public 	HomePage homepage;
	
	@Then("UserenterstheHomePage")
	public void userentersthe_home_page() {
		 homepage = new HomePage();
		Assert.assertEquals(homepage.validateLogo(), true);

	}

	@Then("UserverifytheURLandLogo")
	public void userverifythe_ur_land_logo() {
		
		String url= homepage.validateUrl();
		
		Assert.assertEquals(url.contains("orange"), true);
		String Title = homepage.validateTitle();
		System.out.println(Title);
		Assert.assertEquals(Title.contains("OrangeHRM"), true);
		}


}

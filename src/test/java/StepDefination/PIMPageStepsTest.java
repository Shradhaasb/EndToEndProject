package StepDefination;



import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStepsTest extends BaseClass {
	
	static PIMPage pim;
	public static String EMPId;

	@When("click on pim link and verify user is in pim page'")
	public void click_on_pim_link_and_verify_user_is_in_pim_page() {
	   pim = new PIMPage();
	  pim.ClickOnPimLink();
	  String link =pim.getCurrent();
	   
	  Assert.assertEquals(link.contains("pim"), true);
		
	}

	@Then("click on add button")
	public void click_on_add_button() {
	   pim.clickOnAddButton();
	}

	@Then("enter fname  and lname")
	public void enter_fname_and_lname() {
	    pim.enterFnameAndLname("vikas", "jadhav");
	}

	@Then("capture employee id and store globally")
	public void capture_employee_id_and_store_globally() {
	   EMPId = pim.captureEmployeeId();
	}

	@Then("click on save button")
	public void click_on_save_button() {
	  pim.clickOnSaveButton();  
	}

}
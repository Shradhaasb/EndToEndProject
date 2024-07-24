package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.WaitClass;

public class PIMPage extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement ClickOnPIMLink;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement clickOnAddEmployee;

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empId;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement clickOnSaveButton;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickOnPimLink() {

		WaitClass.click(ClickOnPIMLink);

	}

	public String getCurrent() {
		String PIMUrl = driver.getCurrentUrl();

		return PIMUrl;
	}

	public void clickOnAddButton() {

		WaitClass.click(clickOnAddEmployee);

	}

	public void enterFnameAndLname(String fName, String lName) {
		WaitClass.sendKeys(fname, fName);
		WaitClass.sendKeys(lname, lName);

	}

	public String captureEmployeeId() {
		return WaitClass.getAttribute(empId);
	}

	public void clickOnSaveButton() {
		WaitClass.click(clickOnSaveButton);
	}

}

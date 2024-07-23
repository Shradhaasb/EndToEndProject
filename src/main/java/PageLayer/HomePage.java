package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.WaitClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='client brand banner']")
	public WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateLogo() {

		WaitClass.visibilityOfElement(logo);
		return true;
	}

	public String validateTitle() {

		String title = driver.getTitle();
		return title;
	}

	public String validateUrl() {

		String url = driver.getCurrentUrl();
		return url;
	}
}

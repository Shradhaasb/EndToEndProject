package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.WaitClass;

public class LoginPage extends BaseClass{
	
	
	@FindBy(name="username")
	public WebElement Username;
	
	@FindBy(name="password")
	public WebElement Pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement LoginButton;
	
	
public LoginPage() {
	
	PageFactory.initElements(driver,this);
}

public void enterUserNameAndPass(String userName , String pass) {
	
	WaitClass.sendKeys(Username, userName);
	WaitClass.sendKeys(Pass, pass);
	
}

public void clickOnLoginButton() {
	WaitClass.click(LoginButton);
}
}

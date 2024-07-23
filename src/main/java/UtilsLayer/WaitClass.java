package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitClass extends BaseClass {

	public static void visibilityOfElement(WebElement wb)
	
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(wb));
		
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		 new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
		
		
	}
	 public static void click(WebElement wb) {
		 
		 new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();;
	 }
	 
	 

}

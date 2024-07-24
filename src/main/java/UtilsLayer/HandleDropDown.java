package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	public static void selectByVisibleText(WebElement wb,String st)
	{
		WaitClass.visibilityOfElement(wb);
		Select sel=new Select(wb);
		sel.selectByVisibleText(st);
	}
	
	
}

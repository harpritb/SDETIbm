package com.mmt.pages.homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

	/**
	 * @author Harprit Singh Bedwal
	 * @implNote This method is used to click on the element
	 * 
	 */
	public void javaScriptClickOn(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", element);
	}
	
	/**
	 * @author Harprit Singh Bedwal
	 * @return True or False
	 * @implNote This method is used to verify an element present on the page
	 * 
	 */
	public boolean isElementDisplayed(WebElement element) {
		boolean flag = false;
		if(element.isDisplayed() == true) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
}

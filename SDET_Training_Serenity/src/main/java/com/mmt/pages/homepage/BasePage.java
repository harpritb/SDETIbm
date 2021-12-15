package com.mmt.pages.homepage;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		if (element.isDisplayed() == true) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public void moveToElelment(WebElement element) {
		Actions actn = new Actions(getDriver());
		actn.moveToElement(element).build().perform();
	}

	public void scrollToDocumentHeight() {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void scrollToTopOfThePage() {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0 )");
	}

	public void inputText(WebElement element, String input) {
		element.clear();
		clickOn(element);
		element.sendKeys(input);
	}

	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void scrollDownPageBy250Pixel() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	public void _normalWait(long timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean checkboxStatus(WebElement checkbox) {
		boolean checkstatus = false;
		try {
			if (checkbox.isSelected())
				checkstatus = true;
		} catch (Exception e) {

		}
		return checkstatus;
	}

	public static String generateRandomNumber(int charLength) {
		return String.valueOf(charLength < 1 ? 0
				: new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
						+ (int) Math.pow(10, charLength - 1));
	}
}

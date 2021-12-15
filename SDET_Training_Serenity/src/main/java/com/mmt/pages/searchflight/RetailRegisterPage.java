package com.mmt.pages.searchflight;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mmt.pages.homepage.BasePage;

import io.cucumber.datatable.DataTable;

public class RetailRegisterPage extends BasePage {

	@FindBy(xpath = "//*[@class='fa fa-user-o']")
	WebElement mousehover_WE;
	@FindBy(xpath = "//*[text()='LOGIN / REGISTER']")
	WebElement loginOrRegister_WE;
	@FindBy(xpath = "//*[text()='Register']")
	WebElement register_WE;
	@FindBy(xpath = "//*[@id='input-firstname']")
	WebElement firstname_WE;
	@FindBy(xpath = "//*[@id='input-lastname']")
	WebElement lastname_WE;
	@FindBy(xpath = "//*[@id='input-email']")
	WebElement email_WE;
	@FindBy(xpath = "//*[@id='input-telephone']")
	WebElement telephone_WE;
	@FindBy(xpath = "//*[@id='input-address-1']")
	WebElement address1_WE;
	@FindBy(xpath = "//*[@id='input-address-2']")
	WebElement address2_WE;
	@FindBy(xpath = "//*[@id='input-city']")
	WebElement city_WE;
	@FindBy(xpath = "//*[@id='input-postcode']")
	WebElement postcode_WE;
	@FindBy(xpath = "//*[@id='input-country']")
	WebElement country_WE;
	@FindBy(xpath = "//*[@id='input-zone']")
	WebElement zone_WE;
	@FindBy(xpath = "//*[@id='input-password']")
	WebElement password_WE;
	@FindBy(xpath = "//*[@id='input-confirm']")
	WebElement confirmPassword_WE;
	@FindBy(xpath = "//*[@name='agree']")
	WebElement agree_WE;
	@FindBy(xpath = "//*[@value='Continue']")
	WebElement continue_WE;
	@FindBy(xpath = "//*[contains(text(),'Congratulations')]")
	WebElement congratulationsText_WE;
	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement myaccount_WE;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login_WE;
	

	public void fillRegistrationDetail(DataTable table) {

		List<List<String>> data = table.asLists();

		inputText(firstname_WE, data.get(0).get(1).trim() + generateRandomNumber(2));
		inputText(lastname_WE, data.get(1).get(1).trim() + generateRandomNumber(2));
		inputText(email_WE,
				data.get(2).get(1).trim().replaceAll("@test.com", "") + generateRandomNumber(3) + "@test.com");
		inputText(telephone_WE, data.get(3).get(1).trim() + generateRandomNumber(5));
		inputText(address1_WE, data.get(4).get(1));
		inputText(address2_WE, data.get(5).get(1).trim());
		inputText(city_WE, data.get(6).get(1).trim());
		inputText(postcode_WE, data.get(7).get(1).trim());

	}

	public void dropDown() {
		scrollDownPageBy250Pixel();
		selectFromDropdown(country_WE, "India");
	    _normalWait(2000);
	    scrollDownPageBy250Pixel();
	    scrollDownPageBy250Pixel();
		selectFromDropdown(zone_WE, "Delhi");
	}

	public void password() {
		scrollDownPageBy250Pixel();

		inputText(password_WE, "Com@2468");
		inputText(confirmPassword_WE, "Com@2468");
	

	}

	public void checkBoxAndContinue() {

		scrollDownPageBy250Pixel();
		clickOn(agree_WE);
		clickOn(continue_WE);

	}

	public void mousehoverAndClick() {

		moveToElelment(mousehover_WE);
		clickOn(loginOrRegister_WE);

	}

	public void registerClick() {
		clickOn(register_WE);
	}

	public void verifyText() {
		isElementDisplayed(congratulationsText_WE);

	}
	
	public void loginUser(DataTable table) {
		
		List<List<String>> data= table.asLists();
		inputText(email_WE, data.get(0).get(1).trim());
		inputText(password_WE, data.get(1).get(1).trim());
				
	}
	
	public void loginClick() {
		
		clickOn(login_WE);
	}
	
	public void verifyMyAccountText() {
		
		isElementDisplayed(myaccount_WE);
	}
}

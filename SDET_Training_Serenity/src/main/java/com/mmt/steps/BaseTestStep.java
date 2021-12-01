package com.mmt.steps;

import com.mmt.pages.homepage.AppHomePage;

import net.thucydides.core.annotations.Step;

public class BaseTestStep {

	
	AppHomePage appHomePage;
	
	@Step
	public void i_am_on_application_home_page() {
		appHomePage.getDriver().get("https://www.makemytrip.com/");
		appHomePage.getDriver().manage().window().maximize();
	}
	
}

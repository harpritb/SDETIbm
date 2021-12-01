package com.mmt.stepdefinations;

import com.mmt.steps.BaseTestStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CommonStepDefination {
	
	@Steps
	BaseTestStep baseTestStep;
	
	@Given("I am on Application home page")
	public void i_am_on_application_home_page() {
		
		baseTestStep.i_am_on_application_home_page();
	}

}

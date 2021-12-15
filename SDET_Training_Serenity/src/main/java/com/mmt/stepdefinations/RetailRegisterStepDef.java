package com.mmt.stepdefinations;

import com.mmt.steps.BaseTestStep;
import com.mmt.steps.RetailRegisterStep;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RetailRegisterStepDef {

	@Steps
	RetailRegisterStep RetailRegisterStep;

	@Steps
	BaseTestStep BaseTestStep;

	@Given("launch the application")

	public void launchRetailApp() {

		BaseTestStep.retailAppLaunch();
	}

	@When("hover on login\\/register")
	public void hover_on_login_register() {
		RetailRegisterStep.hover();
	}

	@When("user clicks on Resister")
	public void user_clicks_on_resister() {
		RetailRegisterStep.clicksResister();
	}

	@When("user enters valid credentials")
	public void enters_valid_cred(DataTable dataTable) {
		RetailRegisterStep.enters_valid_credential(dataTable);

	}
	
	@When("clicks login")
	public void loginClick() {
		RetailRegisterStep.loginClick();

	}
	
	
	@When("Enters the details")
	public void enters_the_details(DataTable dataTable) {
		RetailRegisterStep.enters_the_details(dataTable);

	}

	@When("click continue")
	public void click_continue() {
		RetailRegisterStep.click_continue();

	}

	@Then("user should able to reister successfully")
	public void user_should_able_to_reister_successfully() {
		RetailRegisterStep.register_successfully();
	}
	@Then("user should redirect to My accounts page")
	public void verifyMyaccountsText() {
		RetailRegisterStep.verifyMyAccountText();
	}

}

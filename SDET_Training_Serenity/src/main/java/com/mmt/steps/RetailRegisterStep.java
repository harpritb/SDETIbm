package com.mmt.steps;

import com.mmt.pages.searchflight.RetailRegisterPage;

import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

public class RetailRegisterStep  {
	
	RetailRegisterPage rrg =new RetailRegisterPage();

	@Step
	public void hover() {

		rrg.mousehoverAndClick();
	}

	@Step
	public void clicksResister() {
		rrg.registerClick();
	}

	@Step
	public void enters_the_details(DataTable dataTable) {
		rrg.fillRegistrationDetail(dataTable);
		rrg.dropDown();
		rrg.password();
		

	}
	
	@Step
	public void enters_valid_credential(DataTable dataTable) {
		rrg.loginUser(dataTable);
	
	}
	@Step
	public void loginClick() {
		rrg.loginClick();
	
	}

	@Step
	public void click_continue() {
		rrg.checkBoxAndContinue();
	}

	@Step
	public void register_successfully() {
		rrg.verifyText();
	}
	@Step
	public void verifyMyAccountText() {
		rrg.verifyMyAccountText();
	}

}

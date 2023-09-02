package testCases;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.DashboardPo;
import pageObjects.LoginPageObjects;
import modules.DashboardModule;
import modules.LoginModule1;

public class TestCase1 extends TestBaseClass {
	@Test
	public void verify_login_function() {
		LoginModule1 lg = new LoginModule1(driver);
		lg.login(driver, "standard_user", "secret_sauce");
		boolean isDisplayed = DashboardModule.verifyProductLabel(driver);
		assertTrue(isDisplayed, "Products are displayed");

	}
}

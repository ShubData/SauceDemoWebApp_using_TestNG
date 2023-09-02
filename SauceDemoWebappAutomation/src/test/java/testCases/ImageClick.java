package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;
import pageObjects.DashboardPo;

public class ImageClick extends TestBaseClass {
	
	
	@Test
	public void verifyImageClick() {
		LoginModule1 lg = new LoginModule1(driver);
		lg.login(driver, "standard_user", "secret_sauce");
		DashboardModule.imageClick(driver);
		boolean b4 = DashboardModule.productDisplayed(driver, DashboardPo.label_bckpck);
		assertTrue(b4, "Product large view is open");

	}

}

package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;

public class ContnShopBtnTest extends TestBaseClass {
	@Test
	public void verifyContnBtn() {
		setup();
		LoginModule1 lg = new LoginModule1(driver);
		lg.login(driver, "standard_user", "secret_sauce");
		DashboardModule.cartBtnClick(driver);
		DashboardModule.contnShopBtnClick(driver);
		boolean b8 = DashboardModule.verifyProductLabel(driver);
		assertTrue(b8,"Continue shopping button works");
		

}
}

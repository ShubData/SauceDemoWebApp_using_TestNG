package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;

public class LogoutTest extends TestBaseClass{
@Test

public void logoutCheck() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.burgerBtnClick(driver);
	DashboardModule.LogoutClick(driver);
	boolean b3 = LoginModule1.findLogin(driver);
	assertTrue(b3, "Logged out");


}
}
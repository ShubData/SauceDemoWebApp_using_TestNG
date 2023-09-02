package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;

public class SortBtnTest extends TestBaseClass{
@Test	
public void verifysortBtnTest() {
	
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.sortBtnClick(driver);
	boolean b9 =DashboardModule.sortBtnSelected(driver);
	assertTrue(b9, "sort list is displayed");
}
}
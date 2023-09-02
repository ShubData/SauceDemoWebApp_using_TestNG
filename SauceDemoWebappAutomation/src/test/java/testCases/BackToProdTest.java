package testCases;

import static org.testng.Assert.assertTrue;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;

public class BackToProdTest extends TestBaseClass{
@Test
public void verifyBackProdBtn() {

	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.imageClick(driver);
	DashboardModule.backToProdClick(driver);
	boolean b5 = DashboardModule.verifyProductLabel(driver);
	assertTrue(b5,"Back button works");

}
}

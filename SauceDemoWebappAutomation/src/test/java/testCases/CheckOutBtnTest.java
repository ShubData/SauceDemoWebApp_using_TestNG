package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import modules.CartModule;
import modules.DashboardModule;
import modules.LoginModule1;
import pageObjects.DashboardPo;

public class CheckOutBtnTest extends TestBaseClass{
@Test
public void verifyCheckoutBTn() {
	// first logged in
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	// this will click add to cart
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	// this will open cart
	DashboardModule.cartBtnClick(driver);
	// this will click checkout
	CartModule.clickCheckoutBtn(driver);
	// this will check if test worked
	boolean btest = CartModule.checkChkoutTitle(driver);
	assertTrue(btest, "the Checkout button Doesn't work");

}


}

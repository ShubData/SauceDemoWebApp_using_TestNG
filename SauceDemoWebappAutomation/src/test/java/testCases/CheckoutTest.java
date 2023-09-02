package testCases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import modules.CartModule;
import modules.CheckoutModules;
import modules.DashboardModule;
import modules.LoginModule1;
import pageObjects.CheckOutPo;
import pageObjects.DashboardPo;

public class CheckoutTest extends TestBaseClass {
@Test
public void verifyCheckoutContinue() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	// this will click add to cart
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	// this will open cart
	DashboardModule.cartBtnClick(driver);
	// this will click and open checkout page
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "xyz", "1234");
	CheckoutModules.clickContBtn(driver);
	boolean b15 = CheckoutModules.checkChkoutOverview(driver);
	assertTrue(b15, "Continue Btn Doesnt Work");

}

@Test
public void verifyCheckoutFirstNameErrors() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "", "xyz", "1234");
	CheckoutModules.clickContBtn(driver);
	boolean b18 = CheckoutModules.firstnameErrDisplayed(driver);
	assertTrue(b18, "first name Error  Doesnt appear");

}
// Q - when testing inputs for different fields how to implement soft assert
@Test
public void verifyCheckoutLastNameErrors() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "", "1234");
	CheckoutModules.clickContBtn(driver);
	boolean b19 = CheckoutModules.lastnameErrDisplayed(driver);
	assertTrue(b19, "last name Error  Doesnt appear");

}

@Test
public void verifyCheckoutPostCodeErrors() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "xyz", "");
	CheckoutModules.clickContBtn(driver);
	boolean b20 = CheckoutModules.postCodeErrDisplayed(driver);
	assertTrue(b20, "postal code Error  Doesnt appear");

}


@Test
public void verifyChkoutFinish() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "xyz", "1234");
	CheckoutModules.clickContBtn(driver);
	CheckoutModules.clickChkFinishBtn(driver);
	boolean b16 = CheckoutModules.checkChkoutComplete(driver);
	assertTrue(b16, "Finish button doesn't work");

}

@Test
public void verifyChkoutBackHome() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "xyz", "1234");
	CheckoutModules.clickContBtn(driver);
	CheckoutModules.clickChkFinishBtn(driver);
	CheckoutModules.clickBackHome(driver);
	boolean b17 = DashboardModule.verifyProductLabel(driver);
	assertTrue(b17, "Back To home Button doesnt work");

}

@Test
public void  verfiyallChkoutErrors() {
	LoginModule1 lg = new LoginModule1(driver);
	SoftAssert softassert = new SoftAssert();
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	DashboardModule.cartBtnClick(driver);
	CartModule.clickCheckoutBtn(driver);
	
	//first name
	CheckoutModules.enterChkoutFields(driver, "", "xyz", "1234");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	CheckoutModules.clickContBtn(driver);
	boolean b18 = CheckoutModules.firstnameErrDisplayed(driver);
	softassert.assertTrue(b18, "first name Error  Doesnt appear");
	
	// last name
	CheckoutModules.clearChkoutFields(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	CheckoutModules.enterChkoutFields(driver, "abc", "", "1234");
	CheckoutModules.clickContBtn(driver);
	boolean b19 = CheckoutModules.lastnameErrDisplayed(driver);
	softassert.assertTrue(b19, "last name Error  Doesnt appear");
	
	//postal code
	CheckoutModules.clearChkoutFields(driver);
	CheckoutModules.enterChkoutFields(driver, "abc", "xyz", "");
	CheckoutModules.clickContBtn(driver);
	boolean b20 = CheckoutModules.postCodeErrDisplayed(driver);
	assertTrue(b20, "postal code Error  Doesnt appear");
	softassert.assertAll();

}







}

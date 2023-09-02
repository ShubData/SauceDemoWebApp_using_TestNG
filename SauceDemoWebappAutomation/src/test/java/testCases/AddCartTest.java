package testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import modules.CartModule;
import modules.DashboardModule;
import modules.LoginModule1;
import pageObjects.DashboardPo;

public class AddCartTest extends TestBaseClass{
@Test
public void verifyAddToCart() {
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	// this will click add to cart
	DashboardModule.addToCrtBtnClick(driver, DashboardPo.addCrtBckBtn);
	// this will open cart
	DashboardModule.cartBtnClick(driver);
	//this will check if product is added to cart
	boolean b10 = CartModule.checkProductAddToCart(driver);
	assertTrue(b10, "The Product isn't added to cart");
}
}


package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.CartPo;
import pageObjects.CheckOutPo;

public class CartModule {
	public static boolean checkProductAddToCart(WebDriver driver) {
		
		 return driver.findElement(CartPo.cartItem).isDisplayed();
	}
	
	public static void clickCheckoutBtn(WebDriver driver) {
		driver.findElement(CartPo.checkoutBtn).click();
	}
	
	public static boolean checkChkoutTitle(WebDriver driver) {
		return driver.findElement(CheckOutPo.chkoutInfo).isDisplayed();
	}
}

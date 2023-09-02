package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.DashboardPo;
import pageObjects.LoginPageObjects;

public class DashboardModule {
	

	
	public static boolean verifyProductLabel(WebDriver driver) {
		 return driver.findElement(DashboardPo.label_products).isDisplayed();
	}
	
	public static void burgerBtnClick(WebDriver driver) {
		driver.findElement(DashboardPo.burgern_Btn).click();
		
	}
	
	
	public static boolean burgerMenuDisplay(WebDriver driver) {
		return driver.findElement(DashboardPo.burgerMenu).isDisplayed();
	}
	
	public static void burgerCrossBtnClick(WebDriver driver) {

		try {
			driver.findElement(DashboardPo.burger_close).click();
		} catch (ElementNotInteractableException e) {
			
			JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", driver.findElement(DashboardPo.burger_close));
		}

	}
	
	public static void LogoutClick(WebDriver driver) {
		
		driver.findElement(DashboardPo.logout_obj).click();
	}
	
public static void imageClick(WebDriver driver) {
		
		driver.findElement(DashboardPo.image_bckpck).click();
	}
	
public static boolean productDisplayed(WebDriver driver, By label) {
	
	 return driver.findElement(label).isDisplayed();
}

public static void backToProdClick(WebDriver driver) {
	
	driver.findElement(DashboardPo.backToProdBtn).click();
}

public static void cartBtnClick(WebDriver driver) {
	
	driver.findElement(DashboardPo.cartBtn).click();
}
public static boolean cartListDisplayed(WebDriver driver) {
	
	 return driver.findElement(DashboardPo.cartList).isDisplayed();
}

public static void contnShopBtnClick(WebDriver driver) {
	
	driver.findElement(DashboardPo.contnBtn).click();
}

public static void sortBtnClick(WebDriver driver) {
	
	driver.findElement(DashboardPo.sortBtn).click();
}

public static boolean sortBtnSelected(WebDriver driver) {
	
	return driver.findElement(DashboardPo.sortBtn).isEnabled();
}

public static void addToCrtBtnClick(WebDriver driver, By Btn) {
	
	 driver.findElement(Btn).click();
}



}

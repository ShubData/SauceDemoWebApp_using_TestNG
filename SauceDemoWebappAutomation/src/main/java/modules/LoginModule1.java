package modules;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPageObjects;

public class LoginModule1 {
	
	WebDriver driver;
	public LoginModule1(WebDriver driver) {
		this.driver = driver;
	}
	
	
public static void enterUsername(WebDriver driver, String username) {
	driver.findElement(LoginPageObjects.text_username).sendKeys(username);
}

public static void enterPassword(WebDriver driver, String password) {
	driver.findElement(LoginPageObjects.text_password).sendKeys(password);
}

public static void clickLogin(WebDriver driver) {
	driver.findElement(LoginPageObjects.button_login).click();
}

public static void login(WebDriver driver,String username,String password) {
	enterUsername(driver,username);
	enterPassword(driver, password);
	clickLogin(driver);
}

// overloaded methods
public  void enterUsername( String username) {
	driver.findElement(LoginPageObjects.text_username).sendKeys(username);
}

public void enterPassword(String password) {
	driver.findElement(LoginPageObjects.text_password).sendKeys(password);
}

public void clickLogin() {
	driver.findElement(LoginPageObjects.button_login).click();
}

public void login(String username,String password) {
enterUsername(driver, username);
enterPassword(driver, password);
clickLogin(driver);
}

// test 2
public static void verifyErrorLabel(WebDriver driver) {
	String msg = driver.findElement(LoginPageObjects.error_label).getText();
	if (msg.equals("Epic sadface: Username and password do not match any user in this service")) {
		System.out.println("error Message is correct");
	}
	else {
		System.out.println("Error message is incorrect");
	}
	
}


public static boolean findLogin(WebDriver driver) {
	return driver.findElement(LoginPageObjects.button_login).isDisplayed();
}





}

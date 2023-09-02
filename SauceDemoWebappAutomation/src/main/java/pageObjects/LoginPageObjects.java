package pageObjects;

import org.openqa.selenium.By;

public class LoginPageObjects {
public static By text_username = By.xpath("//input[@id='user-name']");
public static By text_password = By.xpath("//input[@id='password']");
public static By button_login= By.xpath("//input[@id='login-button']");
public static By error_label = By.xpath("//h3[@data-test='error']");

}

package pageObjects;

import org.openqa.selenium.By;

public class CheckOutPo {
	public static By firstNameField = By.xpath("//input[@id='first-name']");
	public static By lastNameField = By.xpath("//input[@id='last-name']");
	public static By postCodeField = By.xpath("//input[@id='postal-code']");
	public static By cancelBtn = By.xpath("//button[@id='cancel']");
	public static By continueBtn = By.xpath("//input[@id='continue']");
	public static By firstNameError = By.xpath("//h3[text()='Error: First Name is required']");
	public static By lastNameError = By.xpath("//h3[text()='Error: Last Name is required']");
	public static By postCodeError = By.xpath("//h3[text()='Error: Postal Code is required']");
	public static By errorBtnClose = By.xpath("//button[@class='error-button']");
	public static By chkoutInfo = By.xpath("//span[text()='Checkout: Your Information']");
	public static By chkoutOverview = By.xpath("//span[text()='Checkout: Overview']");
	public static By chkoutFinish = By.xpath("//button[@id='finish']");
	public static By chkoutBckToProdBtn = By.xpath("//button[@id='back-to-products']");
	public static By chkoutCompleteLabel = By.xpath("//span[text()='Checkout: Complete!']");
	
	
	
	
	
}

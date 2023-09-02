package modules;


import org.openqa.selenium.WebDriver;


import pageObjects.CheckOutPo;



public class CheckoutModules {

public static void enterFirstName(WebDriver driver, String firstName) {
	driver.findElement(CheckOutPo.firstNameField).sendKeys(firstName);
	
}
	
public static void enterLastName(WebDriver driver, String lastName) {
	driver.findElement(CheckOutPo.lastNameField).sendKeys(lastName);
	
}

public static void enterPostCode(WebDriver driver, String postCode) {
	driver.findElement(CheckOutPo.postCodeField).sendKeys(postCode);
	
}

// click continue button
public static void clickContBtn(WebDriver driver) {
	driver.findElement(CheckOutPo.continueBtn).click();
}

//click cancel button
public static void clickCancelBtn(WebDriver driver) {
	driver.findElement(CheckOutPo.cancelBtn).click();
}
//click error close  button
public static void clickErrCloseBtn(WebDriver driver) {
	driver.findElement(CheckOutPo.errorBtnClose).click();
}

//main checkout essentials
public static void enterChkoutFields(WebDriver driver,String firstName, String lastName, String postCode) {
	enterFirstName(driver, firstName);
	enterLastName(driver, lastName);
	enterPostCode(driver, postCode);
	
	
}
// Error Displayed Modules
public static boolean firstnameErrDisplayed(WebDriver driver) {
	return driver.findElement(CheckOutPo.firstNameError).isDisplayed();
}
public static boolean lastnameErrDisplayed(WebDriver driver) {
	return driver.findElement(CheckOutPo.lastNameError).isDisplayed();
}
public static boolean postCodeErrDisplayed(WebDriver driver) {
	return driver.findElement(CheckOutPo.postCodeError).isDisplayed();
}

public static boolean checkChkoutOverview(WebDriver driver) {
	return driver.findElement(CheckOutPo.chkoutOverview).isDisplayed();
}

public static void clickChkFinishBtn(WebDriver driver) {
	driver.findElement(CheckOutPo.chkoutFinish).click();
}

public static boolean checkChkoutComplete(WebDriver driver) {
	return driver.findElement(CheckOutPo.chkoutCompleteLabel).isDisplayed();
}

public static void clickBackHome(WebDriver driver) {
	driver.findElement(CheckOutPo.chkoutBckToProdBtn).click();
}

//clear
public static void clearChkoutFirstName(WebDriver driver) {
	driver.findElement(CheckOutPo.firstNameField).clear();
}

public static void clearChkoutLasttName(WebDriver driver) {
	driver.findElement(CheckOutPo.lastNameField).clear();
}

public static void clearChkoutPostCode(WebDriver driver) {
	driver.findElement(CheckOutPo.postCodeField).clear();
}
public static void clearChkoutFields(WebDriver driver) {
	clearChkoutFirstName(driver);
	clearChkoutLasttName(driver);
	clearChkoutPostCode(driver);
}


}

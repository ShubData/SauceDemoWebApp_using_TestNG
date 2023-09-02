package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {

public static WebDriver driver;
	
@BeforeMethod
public static void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
}

@AfterMethod
public static void teardown() {
	driver.close();
}

@BeforeSuite
public static void beforeSuite() {
	System.out.println("Running and Setting up Envioronment");
}

@AfterSuite
public static void afterSuite() {
	System.out.println("Tasks Completed");
}

}

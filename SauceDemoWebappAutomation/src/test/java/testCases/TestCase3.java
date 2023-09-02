package testCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import modules.DashboardModule;
import modules.LoginModule1;

public class TestCase3 extends TestBaseClass {

	@Test
public void burgerBtn_check() {
//	    setup();
		LoginModule1 lg = new LoginModule1(driver);
		lg.login(driver, "standard_user", "secret_sauce");
		DashboardModule.burgerBtnClick(driver);
		boolean b1 = DashboardModule.burgerMenuDisplay(driver);
		assertTrue(b1, "burger button works , items are displayed");
		
//		if (b1) {
//			System.out.println("burger button works , items are displayed");
//		} else {
//			System.out.println("burger button  doesnt works, items not displayed");
//
//		}
		
//		DashboardModule.burgerCrossBtnClick(driver);
//		boolean b2 = DashboardModule.burgerMenuDisplay(driver);
//		if (b2) {
//			System.out.println("burger close button doesnt works , items are displayed");
//		} else {
//			System.out.println("burger close button   works, items not displayed");
//
//		}
		
}
	@Test
public void bugerCloseCheck() {
	//setup();
	LoginModule1 lg = new LoginModule1(driver);
	lg.login(driver, "standard_user", "secret_sauce");
	DashboardModule.burgerBtnClick(driver);
	DashboardModule.burgerCrossBtnClick(driver);
	boolean b2 = DashboardModule.burgerMenuDisplay(driver);
	assertTrue(b2, "burger close button   works, items not displayed");
}

}

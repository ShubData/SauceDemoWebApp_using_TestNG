package testCases;

import org.testng.annotations.Test;

import modules.LoginModule1;

public class TestCase_2 extends TestBaseClass {

	
@Test
public void verify_invalidLogin() {
		LoginModule1 lg = new LoginModule1(driver);
		LoginModule1.login(driver, "standard_user", "secret_saucer");
		LoginModule1.verifyErrorLabel(driver);

	}

}

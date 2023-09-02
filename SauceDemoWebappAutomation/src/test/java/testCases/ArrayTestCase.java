package testCases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.domsnapshot.model.ArrayOfStrings;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtils;

public class ArrayTestCase extends TestBaseClass{

@DataProvider(name="Google_search_terms")
public static Object[][] testData(){ 
	Object[][] obj = ExcelUtils.readExcel("E:\\Automation Testing Java Training\\Search items.xlsx", "Sheet1");
//	obj [0][0]="headphones";
//	obj [1][0]="bluetooth";
//	obj [2][0]="phones";
//	obj [3][0]="laptops";
//	obj [4][0]="tablets";
	System.out.println(Arrays.toString(obj));
	return obj;
}

@Test(dataProvider="Google_search_terms")
public void searchTerms(String search) {
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
}

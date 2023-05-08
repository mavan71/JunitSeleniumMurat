package Day14;

import Utilities.BaseReport;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C01_ExtentReport extends BaseReport {

        // Go to https://www.amazon.com/
        // Click Accounts & Lists
        // Verify you are on the sign in page


    @Test
    public void reportTest(){

        extentTest = extentReports.createTest("Sample Test", "Test Description");

        // Raporlanacak testi olusturmak adina extentTest objesi initialize edilir
        //extentTest.createNode("Sample Test", "Test Description");

        extentTest.info("https://www.amazon.com/ a gidiliyor ");
        driver.get("https://www.amazon.com/");

        extentTest.info("Account Lists linkine tiklaniyor");
        driver.findElement(By.id("nav-link-accountList")).click();

        extentTest.info("Sign in sayfasi dogrulaniyor");
        Assert.assertTrue(driver.getCurrentUrl().contains("signin"));

        extentTest.pass("This is a pass log message");
        extentTest.fail("This is a fail log message");
        extentTest.skip("This is a skip log message");

    }

}

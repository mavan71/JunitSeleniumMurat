package Day05_18Nisan;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_XpathPractice extends Base {

    @Test
    public void test01() throws InterruptedException {

        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesine git.
        // Username alanina 'Admin' degerini yaz.
        // Password alanina 'admin123' degerini yaz
        // Login butonuna tikla
        // Sisteme giris yapildigini dogrula (URL degisimi, Profil, Dashboard, )

        // Expected result -> sisteme giris yapilabilmeli
        // Actual result -> ?

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//*[@placeholder][@type]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals(expectedUrl, actualUrl);



    }


    @Test
    public void test02() throws InterruptedException {

        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesine git.
        // Username alanina 'Karl' degerini yaz.
        // Password alanina 'admin123' degerini yaz
        // Login butonuna tikla
        // Invalid credentials mesajinin goruntulendigini dogrula
        // Sisteme giris yapilamadigini dogrula

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // name attribute u 'user' ile baslayan ve placeholder attribute u 'name' iceren input elementi
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@name, 'user')][contains(@placeholder,'name')]"));
        username.sendKeys("Karl");

        WebElement password = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.xpath("//p[.='Invalid credentials']"));
        Assert.assertTrue(errorMessage.isDisplayed());

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.assertEquals(expectedUrl,actualUrl);






    }
}
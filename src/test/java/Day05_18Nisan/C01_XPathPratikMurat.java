package Day05_18Nisan;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_XPathPratikMurat extends Base {
    @Test
    public void Test01() throws InterruptedException {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        //User alanına Admin değerini yaz
        //password alanına admin123 yaz
        //login butnuna tıkla
        //sisteme giriş yapıldığını doğrula(URL den doğruluyobiliriz, profilden doğrulayabiliriz )
        //Expected result sisteme giriş yapabilmeli
        //actual result ?
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ////input[@name='username']
        Thread.sleep(2000);
        WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        Thread.sleep(2000);


        //aşağıdaki 4 login Webelement de aynıdır hepsinde test geçti.
        //tag yerine *, text() yerine . koyabiliriz.
        //text() ile . arasındaki fark: text() elamanı sadece elamanımızın contentini verirken,
        // . operatörün tüm elamanların content ini verir
        //WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        //WebElement login=driver.findElement(By.xpath("//*[text()=' Login ']"));
        //WebElement login=driver.findElement(By.xpath("//*[.=' Login ']"));
        WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
        login.click();
        Thread.sleep(2000);

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    @Test
    public void test02() throws InterruptedException {

        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesine git.
        // Username alanina 'Karl' degerini yaz.
        // Password alanina 'admin123' degerini yaz
        // Login butonuna tikla
        // Invalid credentials mesajinin goruntulendigini dogrula
        // Sisteme giris yapilamadigini dogrula
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username= driver.findElement(By.xpath("//input[starts-with(@name,'user')][contains(@placeholder,'name')]"));
        username.sendKeys("Murat");
        WebElement password= driver.findElement(By.xpath("//input[starts-with(@type,'pass')][contains(@name,'word')]"));
        password.sendKeys("admin123");
        WebElement login =driver.findElement(By.xpath("//button[contains(.,'Login')][starts-with(@type,'sub')]"));
        login.click();
        Thread.sleep(3000);
        WebElement hataMesaji=driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(hataMesaji.isDisplayed());

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}

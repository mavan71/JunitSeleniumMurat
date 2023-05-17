package Day06.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHomework6 {

        /*
        https://www.teknosa.com/ adresine gidiniz.
    Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
    Sonuç sayısını yazdırınız.
    Çıkan ilk ürüne tıklayınız.
    Sepete ekleyiniz.
    Sepetime gite tıklayınız.
    Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
    Alışverişi tamamlayınız.
    Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
    Driver’ı kapatınız.
         */

    @Test
    public void LocatorHomework6() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.teknosa.com/");
        Thread.sleep(1000);

        WebElement serch= driver.findElement(By.xpath("//input[@id='search-input']"));
        serch.sendKeys("oppo");
        serch.submit();
        Thread.sleep(1000);
        WebElement sonuclar = driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println("sonuclar.getText() = " + sonuclar.getText());
        WebElement ilkUrun = driver.findElement(By.xpath("//a[@class='prd-link gowitPlp-js'][1]"));
        Thread.sleep(5000);
        ilkUrun.click();
        Thread.sleep(5000);
        WebElement sepeteEkle= driver.findElement(By.xpath("(//button[@id='addToCartButton'])[1]"));
        Thread.sleep(1000);
        sepeteEkle.click();
        Thread.sleep(1000);
        WebElement sepeteGit = driver.findElement(By.xpath("//span[text()='Sepetime Git']"));
        sepeteGit.click();
        Thread.sleep(1000);
        WebElement ozet = driver.findElement(By.xpath("//a[@style='text-transform: capitalize;']"));
        System.out.println("ozet.getText() = " + ozet.getText());
        WebElement tamamla = driver.findElement(By.xpath("//a[@href='/sepet/checkout']"));
        tamamla.click();
        Thread.sleep(1000);
        WebElement hosGeldiniz = driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println("hosGeldiniz.getText() = " + hosGeldiniz.getText());
        Thread.sleep(1000);
        driver.quit();


    }
}

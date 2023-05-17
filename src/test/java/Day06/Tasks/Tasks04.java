package Day06.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Tasks04 extends Base {
    //https://www.teknosa.com/ adresine gidiniz.
    //Arama çubuğuna ‘’oppo’’ yazıp ENTER tıklayınız.
    //Sonuç sayısını yazdırınız.
    //Çıkan ilk ürüne tıklayınız.
    //Sepete ekleyiniz.
    //Sepetime gite tıklayınız.
    //Konsolda "Sipariş Özeti" WebElement’inin text’ini yazdırınız.
    //Alışverişi tamamlayınız.
    //Son olarak "Teknosa’ya Hoş Geldiniz" WebElement’inin text’ini yazdırınız.
    //Driver’ı kapatınız.

    @Test
    public void test01() throws InterruptedException{
        driver.get("https://www.teknosa.com/");
        WebElement searchBox= driver.findElement(By.id("search-input"));
        searchBox.sendKeys("oppo"+ Keys.ENTER);
        WebElement aramaSonucu= driver.findElement(By.xpath("//div[@class='plp-info']"));
        System.out.println("aramaSonucu : "+aramaSonucu.getText());
        Thread.sleep(3000);
        WebElement ilkelement=driver.findElement(By.xpath("(//a[@class='prd-link '])[1]"));

        Thread.sleep(3000);
        WebElement ikinci =driver.findElement(By.id("ins-editable-button-1580496494"));
        ikinci.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='prd-link '])[1]")).click();


    }



}

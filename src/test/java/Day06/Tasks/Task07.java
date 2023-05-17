package Day06.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task07 extends Base {
    //Go to URL: https://demoqa.com/radio-button
    //Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
    @Test
    public void test01() {
        driver.get("https://demoqa.com/radio-button");
        System.out.println("*******Yes Butonu*************");
        WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yes.click();
        WebElement yestikliIkencikanYazi = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        Assert.assertTrue(yestikliIkencikanYazi.isDisplayed());

        System.out.println("*******Impressive Butonu*************");
        WebElement impressive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressive.click();
        WebElement impressivetikliIkencikanYazi = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        Assert.assertTrue(impressivetikliIkencikanYazi.isDisplayed());

        System.out.println("*******No Butonu*************");
        WebElement no = driver.findElement(By.xpath("//label[@for='noRadio']"));
        no.click();
        WebElement notikliIkencikanYazi = driver.findElement(By.xpath("//p[text()='You have selected ']"));
        Assert.assertTrue(impressivetikliIkencikanYazi.isDisplayed());

    }
}

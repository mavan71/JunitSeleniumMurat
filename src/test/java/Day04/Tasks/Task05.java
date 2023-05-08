package Day04.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task05 {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.
    @Test
    public void test05() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://id.heroku.com/");
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("mavan1234@gmail.com");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("1234567890");
        WebElement login=driver.findElement(By.name("commit"));
        login.click();//alert alert-danger
        WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        String sonuc;
        sonuc = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        String expectedsonuc="There was a problem with your login.";
        Assert.assertEquals(sonuc,expectedsonuc);
        if(sonuc.equals(expectedsonuc)){
            System.out.println("Kayıt Yapılmadı"+"hata aciklamasi = " + sonuc);
        }else
        System.out.println("Kayıt Yapıldı");
        Thread.sleep(3000);
        driver.quit();

    }
}

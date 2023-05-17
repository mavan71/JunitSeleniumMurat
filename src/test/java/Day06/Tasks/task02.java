package Day06.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class task02 {

    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://id.heroku.com/login");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("mavan71@gmail.com");
        WebElement  password= driver.findElement(By.id("password"));
        password.sendKeys("12345678");
        WebElement login=driver.findElement(By.name("commit"));
        login.submit();
        WebElement hataMesage=driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        String actuallySonuc=hataMesage.getText();
        String expectedSonuc="There was a problem with your login.";
        Assert.assertEquals(expectedSonuc,actuallySonuc);
        if(hataMesage.isDisplayed()){
            System.out.println("Kayıt Yapılmadı");
        }else
        System.out.println("Kayıt Yapıldı");
        Thread.sleep(3000);
        driver.quit();
    }
}

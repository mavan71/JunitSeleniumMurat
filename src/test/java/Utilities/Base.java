package Utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Base {


    protected WebDriver driver;
    protected Actions actions;
    protected Faker faker=new Faker();


    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//15 saniye boyunca bir element ararken bu
        actions = new Actions(driver);

        // element bulunmazsa hata fırlatma demektir.
        //Thread seleep bizim threadimizi donduruyordu uyutuyordu.ve o süre boyunca beklememizi sağlıyordu
        //BAzı sitelerde yüklenme durumu var. bi site yüklenirken site tamamen yüklenmesi uzun sürebilir.site yüklendikten sonra
        // arkada birtakım java script kodları yüklenmeye devam ediyor olabilir.
        // Bundan dolayı element locate ederken elementimiz o anda yüklenmediğinde, test methodumuz o elementi bulamaz ve hata fırlata bilir.
        //Bu implicitlyWait metodu şu işe yarayor 15 saniye boyunca bir element ararken bu element bulunmazsa
        // 15 saniye boyunca hata mesajı fırlatma diyoruz.10. saniyede bulursa yoluna devam ediyor.

        //Actions actions = new Actions(driver);
    }

    @After
    public void teardown(){

        //driver.quit();

    }



}
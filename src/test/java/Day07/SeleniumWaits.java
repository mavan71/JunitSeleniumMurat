package Day07;
//selenium wait ler selenium için kritik bir konseptir. senkronize bir şekilde elementleriömizi bulmamızı
// ve elementfound gibi

// IMPLICIT WAIT --> Cok kullanilir
// Sayfa ilk yuklendiginde "Unable to locate element", "element not found" gibi hatalari almamizi engelleyen wait'dir
// Imolicit wait bize sadece element locate bekleme konusunda yardimci olur
// Global bir wait turudur. Driver uzerinden 1 kere cagrilir
// Implicit syntax --> driver.manage().timeouts().implicitlywait()
// Element belirlenen sure boyunca locate edilmeye calisilir. Bulunamadigi takdirde hata firlatilir.
// Bulunursa bekleme sonlanir
//driver.manage().timeouts().implicitlywait()


// EXPLICIT WAIT --> Cok kullanilir
// WebDriverWait wait = new WebDriverWait(driver, duration)
// wait.until(condition(element))
// Elementimiz icin bir sart sagliyoruz ve bu sart gerceklesene kadar bekle diyoruz
// Implicit wait'in yetersiz oldugu durumlarda explicit wait kullanilir.
// Cok daha fazla condition vardir ve bu condition'lar secilebilir veya custom olarak yazilabilir
// Explicit wait bize cok fazla durumda bekleme konusunda yardimci olur
// Her bir elementimiz icin tek tek cagirmak zorundayiz. Local bir wait turudur
// Elementin belirlenen sure  boyunca sarti saglayip saglamadigi kontrol edilir.
// Sagladigi anda devam edilir. Saglamazsa exception firlatilir.

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaits extends Base {


        // Selenium wait ler selenium icin kritik bir konsepttir. Senkronize bir sekilde elementleri bulmamizi
        // ve elementnotfound gibi hatalari almamizi engeller.

        // Implicit Wait
        // Explicit Wait *
        // Fluent Wait

    @Test
    public void explicitWait(){

        //BU CLASS SADECE ORNEK VERMEK ICIN YAZILMISTIR CALISTIRIRSANIZ HAYAL KIRIKLIGI OLABILIR :)


        //Explicit wait nasil kullanilir

        // 1- WebDriverWait objesi olustur
        // 2- wait objesinin until methoduna istedigin condition u sagla
        // 3- explicit wait in tadini cikar


        // 1- WebDriverWait objesi olustur
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        //Assumption: Kodumuzun bu noktasinda element yuklenme durumunda oldugundan
        // dolayi locate edilebiliyor fakat tiklanamiyor. Element not clickable hatasi firlatiliyor

        // 2- wait objesinin until methoduna istedigin EXPECTED condition u sagla
        // ExpectedConditions class i bizim icin onceden yazilan hazir conditionlari barindirir

        //Yontem 1
        By locator = By.id("elementId");
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

        //Yontem 2
        By locator2 = By.id("elementId");
        wait.until(ExpectedConditions.elementToBeClickable(locator2));
        driver.findElement(locator2).click();


        // wait.until() ifadesi sart gerceklestiginde farkli formlara burunebilir
        // Bu formlardan bazilari ve en cok kullanilanlari
        //  1- WebElement
        //  2- WebDriver
        //  3- Boolean
        //  4- Alert

    }


        // WEBDRIVER WAIT SUREKLI KULLANILABILECEGINDEN ASAGIDAKI GIBI
        // YARDIMCI METHODLAR OLUSTURULUP KOD OKUNUR HALE GETIRILEBILIR

    public static void waitandclick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }

}
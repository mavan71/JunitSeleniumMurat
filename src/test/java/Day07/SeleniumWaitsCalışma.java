package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitsCalışma extends Base {

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

    @Test
    public void explicitWait() {

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
        By locator= By.id("elementId");
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

        By locator2= By.id("elementId");
        wait.until(ExpectedConditions.elementToBeClickable(locator2));
        driver.findElement(locator2).click();

    }


}

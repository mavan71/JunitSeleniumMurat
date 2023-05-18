package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C03_WindowHandle extends Base {


        // 1- browser ac
        // 2- acilan sekmede https://www.amazon.com/ ac
        // 3- yeni sekme olustur
        // 4- acilan sekmede https://www.linkedin.com/ ac
        // 5- yeni pencere olustur
        // 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        // 7- amazon sekmesine gecerek arama kismina 'Amazon sekmesini buldun' yaz


    @Test
    public void windowHandles(){
        driver.get("https://www.amazon.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Set<String> windowHandles = driver.getWindowHandles();// aşağıdaki kod parçası, WebDriver ile açılan tüm pencerelerin tanıtıcılarını elde eder ve bir Set<String> kümesine atar:
        Iterator<String> i = windowHandles.iterator();
        /*
        windowHandles isimli bir Set<String> kümesi olduğunu varsayarsak, windowHandles.iterator() ifadesi,
        bu kümenin üzerinde döngü yapmak için bir Iterator nesnesi oluşturur.
        Iterator nesnesi, belirli bir koleksiyon üzerinde gezinmeyi sağlayan bir Java arabirimidir.

        Iterator nesnesi, hasNext() ve next() gibi metotları sağlar. hasNext() metodu,
        ilerleyebilecek bir sonraki öğe olup olmadığını kontrol ederken, next() metodu bir sonraki öğeyi döndürür
        ve iteratoru bir sonraki konuma taşır.
         */
        while (i.hasNext()){
            String currentHandle = i.next();
            driver.switchTo().window(currentHandle);
            System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

            // driver imin aktif sekmesinin title i amazon kelimesini icerdiginde donguyu terk et
            if (driver.getTitle().toLowerCase().contains("amazon")){
                break;
            }

        }

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon sekmesini buldun");

    }
}
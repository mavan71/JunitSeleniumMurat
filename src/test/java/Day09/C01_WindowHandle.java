package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C01_WindowHandle extends Base {


    @Test
    public void test01() {

//        driver.getWindowHandle(); -> aktif olan pencere ve sekmemizin window handle (id) degerini bize verir.
//        driver.getWindowHandles(); -> tum pencere ve sekmelerin window handle (id) lerini bir Set olarak bize dondurur.
//        driver.switchTo().window(id); -> window handle degeri id olan pencere veya sekmeye gecis yapmamizi saglar.
//        driver.switchTo().newWindow(TAB); -> Yeni sekme olusturur.
//        driver.switchTo().newWindow(WINDOW); -> Yeni pencere olusturur.


        // 1- browser ac
        // 2- acilan sekmede https://www.amazon.com/ ac
        // 3- yeni sekme olustur
        // 4- acilan sekmede https://www.linkedin.com/ ac
        // 5- yeni pencere olustur
        // 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac

        driver.get("https://www.amazon.com/");
        System.out.println("Amazon sekmesinin window handle degeri: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com/");
        System.out.println("Linkedin sekmesinin window handle degeri: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        System.out.println("OrangeHRM penceresinin window handle degeri: " + driver.getWindowHandle());

        //driver.close(); -> aktif olan pencere veya sekmeyi kapatir diger sekmeler acik kalmaya devam eder

        //driver.quit(); -> tum sekme ve pencereleri kapatir
    }
}
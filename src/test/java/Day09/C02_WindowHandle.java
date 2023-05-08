package Day09;


import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C02_WindowHandle extends Base {
    @Test
            public void test02() throws InterruptedException {
        //driver.getWindowHandle();
        //driver.getWindowHandles();
        //driver.switchTo.Window(String WindowHandle)

        // 1- browser aç
        // 2- yeni sekme olustur
        // 3- yeni pencere olustur
        // 4- 2. scekmede https://www.linkedin.com/ ac
        // 5- son pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        // 6- Ilk sekmede https://www.amazon.com/ ac

        //ilk açılan sekmemede ikinceye geçmeden windowHandle değerini saklıyoruz.
        String firsTab= driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        String secondTab=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        String thirdTab=driver.getWindowHandle();
        driver.switchTo().window(secondTab);//2. sekmeye geçildi
        driver.get("https://www.linkedin.com");

        driver.switchTo().window(thirdTab);//3. sekmeye geçildi
        driver.get("https://www.orangeHRM.com");
        Thread.sleep(2000);
        driver.switchTo().window(firsTab);//1. sekmeye geçildi
        driver.get("https://www.amazon.com");
        driver.quit();
    }


}

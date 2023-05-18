package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C02_WindowHandle2Calisma extends Base {


    @Test
    public void test01(){
        //driver.getWindowHandle();
        //driver.getWindowHandles();
        //driver.switchTo.Window(String WindowHandle)

        // 1- browser aç
        // 2- yeni sekme olustur
        // 3- yeni pencere olustur
        // 4- 2. scekmede https://www.linkedin.com/ ac
        // 5- son pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        // 6- Ilk sekmede https://www.amazon.com/ ac
        String firstTab= driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);// yeni bir pencere oluşturdu
        String secondTab= driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);// yeni bir pencere oluşturdu
                String thirdTab= driver.getWindowHandle();
                driver.switchTo().window(secondTab);// 2. tab a gitti
                driver.get("https://www.linkedin.com/");
                driver.switchTo().window(thirdTab);// 3. tab a gitti
                driver.get("https://opensource-demo.orangehrmlive.com/");
                driver.switchTo().window(firstTab);// 1. tab a gitti
                driver.get("https://www.amazon.com/");
                driver.quit();

    }

}

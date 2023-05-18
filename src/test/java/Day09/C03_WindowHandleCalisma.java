package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C03_WindowHandleCalisma extends Base {


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
        driver.get("https://opensource-demo.orangehrmlive.com/");




    }





}

package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class C02_JSExecutor extends Base {

    @Test
    public void jsexecutor(){

        driver.get("https://www.amazon.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;



        //jse.executeScript("alert(\"Merhaba Dünya!\");");

        //id = twotabsearchtextbox

//        jse.executeScript("console.log(\"JS kullanarak konsola siziyoruz\");");

        jse.executeScript("document.getElementById(\"twotabsearchtextbox\").style.backgroundColor = \"red\"");

    }


    @Test
    public void scrollWithJs() throws InterruptedException {

        // Bunlar JS methodlari

        // scrollBy()
        // scrollTo()
        // scrollIntoView()


        driver.get("https://www.amazon.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,800);"); // sayfamizda 800 piksel asagiya scroll yaptik

        jse.executeScript("window.scrollTo(0,0)"); // sayfamizin (0,0) noktasina scroll yaptik (Sayfanin en ustu)

        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");//Sayfanin en altina scroll yaptik

        jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.id("gw-sign-in-button")));


        for (int i = 0; i < 50; i++) {
            jse.executeScript("window.scrollBy(0,30);");
            Thread.sleep(200);

        }




    }
}
package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class C02_JsExecutorCalisma extends Base {

    @Test
    public void jsexecutor(){
        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        //jse.executeScript("alert(\"Merhaba dünya!\");");
        //id=twotabsearchtextbox
        //jse.executeScript("console.log(\"JS kullanarak Konsola sızıyoruz\");");
        jse.executeScript("document.getElementById(\"twotabsearchtextbox\").style.backgroundColor = \"blue\"");
    }

    @Test
    public void scrollWithJs() throws InterruptedException {
        // Bunlar JS methodlari

        // scrollBy()
        // scrollTo()
        // scrollIntoView()
        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(3000);
        jse.executeScript("window.scrollTo(0,0)");
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight/3)");
        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("gw-sign-in-button")));
        Thread.sleep(3000);
        for (int i = 0; i < 50; i++) {
            jse.executeScript("window.scrollBy(0,30)");
            Thread.sleep(300);

        }
    }




}

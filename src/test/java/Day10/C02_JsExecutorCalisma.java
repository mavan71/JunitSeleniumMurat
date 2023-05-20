package Day10;

import Utilities.Base;
import org.junit.Test;
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
    public void scrollWithJs(){
        // Bunlar JS methodlari

        // scrollBy()
        // scrollTo()
        // scrollIntoView()
        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("");
    }




}

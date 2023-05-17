package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class C01_Alert extends Base {

    @Test
    public void alerts(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //https://the-internet.herokuapp.com/basic_auth
        // Click for JS Alert Buton a tıkla
        //Alert teki OK butonuna tıkla

       List< WebElement> buttons= driver.findElements(By.tagName("button"));

        buttons.get(0).click();

        //Alert teki OK butonuna tıkla
        driver.switchTo().alert().accept();


        //JS confirm butonuna tıkla
        buttons.get(1).click();
        //Alert teki cansel butonuna tıkla
        driver.switchTo().alert().dismiss();

        //JS prompt butonuna tıkla
        buttons.get(2).click();
        //Alert e Murat AVAN yaz ve OK a tıkla
        driver.switchTo().alert().sendKeys("Murat AVAN");
        driver.switchTo().alert().accept();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       // wait.until(ExpectedConditions.elementToBeClickable(hiddenElemen)).click();

              }

    }



package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Actions extends Base {

    // https://www.google.com/ u ac
    // Arama kismina chatGPT yaz


    @Test
    public void test01(){

        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);

        // Mouse hareketlerinde basili tutma islemi clickAndHold() methodu ile yapilir
        // Basili tutma islemi release() methodu ile sonlandirilir.

        // keyDown() klavyede bir tusa basili tutmayi saglar
        // keyUp() ise basili tutma islemini sonlandirir


        actions.
                moveToElement(search).
                click().
                sendKeys("chat").
                keyDown(Keys.SHIFT).
                sendKeys("gpt").
                keyUp(Keys.SHIFT).
                perform();

    }



}
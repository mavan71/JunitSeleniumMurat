package Day08;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_Iframes extends Base {

//    Go to URL: https://the-internet.herokuapp.com/iframe
//    Verify the Bolded text contains “Editor”
//    Locate the text box
//    Delete the text in the text box
//    Type “Hi everyone”
//    Verify the text Elemental Selenium text is displayed on the page.



    @Test
    public void iFrames(){

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement h3 = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.getText().contains("Editor"));

        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.id("tinymce"));

        textBox.clear();

        textBox.sendKeys("Hi Everyone");

        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        WebElement elementalSelenium = driver.findElement(By.partialLinkText("Elemental"));
        Assert.assertTrue(elementalSelenium.isDisplayed());





    }



}
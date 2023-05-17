package Day08;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_IframesCalisma extends Base {

    //    Go to URL: https://the-internet.herokuapp.com/iframe
//    Verify the Bolded text contains “Editor”
//    Locate the text box
//    Delete the text in the text box
//    Type “Hi everyone”
//    Verify the text Elemental Selenium text is displayed on the page.
    @Test
    public void Iframe() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement baslikDogrulama= driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String actuallybaslik= baslikDogrulama.getText();
        String expectedBaslik="An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actuallybaslik,expectedBaslik);
        driver.switchTo().frame(0);
        WebElement IframeYazi=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        Thread.sleep(3000);
        IframeYazi.clear();
        Thread.sleep(3000);
        IframeYazi.sendKeys("Hi everybody");
        //driver.close();
        driver.switchTo().parentFrame();
        WebElement ElementlSelenium=driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        Assert.assertTrue(ElementlSelenium.getText().contains("Elemental"));

    }
}

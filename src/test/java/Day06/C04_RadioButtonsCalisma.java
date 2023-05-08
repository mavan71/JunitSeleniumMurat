package Day06;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_RadioButtonsCalisma extends Base {

    @Test
    public void radioButtons() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        ////a[@data-testid='open-registration-form-button']

        WebElement girisYapButton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        girisYapButton.click();
        //(//input[@type='radio'])[1]
        WebElement femaleRadio= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadio= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customRadio= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));


        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());
        Thread.sleep(2000);
        femaleRadio.click();
        Assert.assertTrue(femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());
        Thread.sleep(2000);
        maleRadio.click();
        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());
        Thread.sleep(2000);
        customRadio.click();
        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(customRadio.isSelected());
        Thread.sleep(2000);
        driver.quit();




    }



}

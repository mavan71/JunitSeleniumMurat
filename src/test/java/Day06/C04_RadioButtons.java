package Day06;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_RadioButtons extends Base {

    @Test
    public void radioButtons() throws InterruptedException {

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[@data-testid]")).click();

        WebElement femaleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customRadio = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());

        femaleRadio.click();
        Thread.sleep(3000);
        Assert.assertTrue(femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());

        maleRadio.click();
        Thread.sleep(3000);
        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());

        driver.quit();


    }




}
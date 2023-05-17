package Day06.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 extends Base {
    //Go to URL: https://demoqa.com/
    //Click on Elements.
    //Click on Checkbox.
    //Verify if Home checkbox is selected.
    //Verify that "You have selected" is visible
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demoqa.com/");
        WebElement Element= driver.findElement(By.xpath("//h5[text()='Elements']"));
        Element.click();
        WebElement checkBox= driver.findElement(By.xpath("//span[text()='Check Box']"));
        checkBox.click();

        WebElement checkBoxHome=driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        Thread.sleep(3000);
        Assert.assertFalse(checkBoxHome.isSelected());
        Thread.sleep(3000);
        if(!checkBoxHome.isSelected()){
            checkBoxHome.click();
        }
        WebElement Selecteddogrulams= driver.findElement(By.xpath("//span[text()='You have selected :']"));
        Assert.assertTrue(Selecteddogrulams.isDisplayed());


    }
}

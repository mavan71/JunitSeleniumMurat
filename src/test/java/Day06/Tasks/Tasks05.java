package Day06.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tasks05 extends Base {
    //Go to https://the-internet.herokuapp.com/checkboxes
    //Locate the elements of checkboxes.
    //Then click on checkbox 1 if box is not selected.
    //Then click on checkbox 2 if box is not selected.
    //Then verify that checkbox 1 is checked.
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        Thread.sleep(3000);

        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Thread.sleep(3000);
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox1.isSelected());
        Thread.sleep(3000);
        checkbox1.click();
        checkbox2.click();
    }


}

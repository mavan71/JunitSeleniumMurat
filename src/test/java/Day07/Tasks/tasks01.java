package Day07.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class tasks01 extends Base {

    //Go to URL: https://demoqa.com/select-menu
    //Select options in Standard multiple select
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement cars= driver.findElement(By.id("cars"));
        Select select=new Select(cars);
        select.selectByVisibleText("Volvo");
        Thread.sleep(3000);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByValue("opel");
        Thread.sleep(3000);
        select.selectByIndex(3);
    }
}

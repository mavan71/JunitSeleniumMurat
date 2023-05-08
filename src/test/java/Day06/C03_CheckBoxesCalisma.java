package Day06;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_CheckBoxesCalisma extends Base {


    @Test
    public void checkboxes() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));//not checked
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));//checked

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        Thread.sleep(2000);
        checkbox1.click();
        Thread.sleep(2000);
        checkbox2.click();
        Thread.sleep(2000);
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

    }

}

package Day06;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_CheckBoxes extends Base {



    @Test
    public void checkboxes(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");


        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")); // not checked
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")); // checked

        System.out.println("Checkbox1 = " + checkbox1.isSelected());
        System.out.println("Checkbox2 = " + checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();

        System.out.println("Checkboxlara tiklandi.....");

        System.out.println("Checkbox1 = " + checkbox1.isSelected());
        System.out.println("Checkbox2 = " + checkbox2.isSelected());

    }

}
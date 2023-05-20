package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Actionscalisma extends Base {
    //Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.
    //put rome to Italy
    @Test
    public void test01(){
        driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement washington= driver.findElement(By.id("box3"));

        WebElement italy= driver.findElement(By.id("box106"));
        WebElement us= driver.findElement(By.id("box103"));
        Actions actions=new Actions(driver);

        actions.dragAndDrop(rome,italy).perform();
        //actions.moveToElement(washington).clickAndHold().moveToElement(us).release().perform();






    }
}

package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_ActionsCalisma extends Base {
    // Bu zamana kadar kullandigimiz aksiyon methodlari sendKeys ve click den ibaretti.
    // Peki ya biz bu hareketlerdene daha farkli hareketler yapmak istersek....
    // Sağ tıklamak orta taklamak üzerinde durup bekleme, tutup sürüklemek
    @Test
            public void test01(){
        driver.get("https://demoqa.com/buttons");
        Actions actions=new Actions(driver);
        WebElement doubleClick= driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClick= driver.findElement(By.id("rightClickBtn"));
        WebElement ClickMe= driver.findElement(By.xpath("//button[text()='Click Me']"));

        actions.doubleClick(doubleClick).perform();
        actions.contextClick(rightClick).perform();
        actions.click(ClickMe).perform();

        actions.
                doubleClick(doubleClick).
                contextClick(rightClick).
                click(ClickMe).
                perform();

    }



}

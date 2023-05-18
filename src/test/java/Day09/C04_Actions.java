package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C04_Actions extends Base {

        // Bu zamana kadar kullandigimiz aksiyon methodlari sendKeys ve click den ibaretti.
        // Peki ya biz bu hareketlerdene daha farkli hareketler yapmak istersek....
        // Sağ tıklamak orta taklamak üzerinde durup bekleme, tutup sürüklemek

        //    Go to URL: https://demoqa.com/buttons
        //    Run the buttons on the page using the Actions Class.
        //    Verify the texts that appear after the buttons are operated.


    @Test
    public void test01(){

        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);

        //Actions objesi ile biz sag click, cift click, element uzerine gelme, scroll, klavye operasyonlari gerceklestirebiliriz.
        // !!!Bu methodlar cagirildiktan sonra perform() methodu cagirilmadigi surece aksiyonlar gerceklesmez!!!
        //Actions objesinde methodlar zincirlenebilir


        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        WebElement clickButton = driver.findElement(By.xpath("(//button)[4]"));

//        actions.doubleClick(doubleClickButton).perform();
//        actions.contextClick(rightClickButton).perform();
//        actions.click(clickButton).perform();

        actions.
                doubleClick(doubleClickButton).
                contextClick(rightClickButton).
                click(clickButton).
                perform();

    }

}
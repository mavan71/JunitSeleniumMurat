package Day06.Tasks;


import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBox_Homework3 extends Base {

    WebElement selectText;
    //    Go to URL: https://demoqa.com/radio-button
    //    Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
    //    Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

    @Test
    public void test01(){

        driver.get("https://demoqa.com/radio-button");

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='like']"));


        for (WebElement radioButton : radioButtons){
            if (radioButton.isEnabled()) {
                radioButton.sendKeys(Keys.SPACE);
                selectText = driver.findElement(By.xpath("//p[@class='mt-3']"));
                String text = selectText.getText();
                System.out.println("text = " + text);
            }
        }
    }
}
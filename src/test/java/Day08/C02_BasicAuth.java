package Day08;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_BasicAuth extends Base {


    @Test
    public void basicAuth(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement congrats = driver.findElement(By.tagName("p"));
        Assert.assertTrue(congrats.getText().contains("Congratulations"));

    }

}

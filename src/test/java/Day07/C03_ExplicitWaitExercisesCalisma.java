package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C03_ExplicitWaitExercisesCalisma extends Base {
    @Test
    public void explicitWait(){
        driver.get("https://www.bestbuy.com");
        WebElement hiddenElement=driver.findElement(By.xpath("(//a[@class='us_link')[2]"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(hiddenElement)).click();
    }
}

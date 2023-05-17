package Day06.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class teask03 extends Base {
    //Navigate to https://testpages.herokuapp.com/styled/indx.html
    //Click on Calculate under Micro Apps.
    //Type any number in the first input.
    //Type any number in the second input.
    //Click on Calculate.
    //Get the result.
    //Print the result.
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/");
        WebElement calculator= driver.findElement(By.id("calculatetest"));
        calculator.click();
        WebElement giris1= driver.findElement(By.id("number1"));
        giris1.sendKeys("2345");
        WebElement giris2= driver.findElement(By.id("number2"));
        giris2.sendKeys("1234");
        driver.findElement(By.id("calculate")).click();
        WebElement Answer= driver.findElement(By.id("answer"));
        System.out.println("sonuc :"+Answer.getText());


        Thread.sleep(3000);
        driver.quit();
    }

}

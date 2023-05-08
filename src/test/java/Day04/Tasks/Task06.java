package Day04.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task06 {
    //Navigate to https://testpages.herokuapp.com/styled/index.html
    //Click on Calculator under Micro Apps.
    //Type any number in the first input.
    //Type any number in the second input.
    //Click on Calculate.
    //Get the result.
    //Print the result.
    @Test
    public void test06() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //#calculatetest
        WebElement calculator= driver.findElement(By.id("calculatetest"));
        calculator.click();
        Thread.sleep(3000);
        WebElement number1= driver.findElement(By.id("number1"));
        number1.sendKeys("30");
        WebElement number2= driver.findElement(By.id("number2"));
        number2.sendKeys("45");
        WebElement calculate= driver.findElement(By.id("calculate"));
        calculate.click();
        WebElement Answer= driver.findElement(By.id("answer"));
        System.out.println(driver.findElement(By.id("answer")).getText());

    }
}

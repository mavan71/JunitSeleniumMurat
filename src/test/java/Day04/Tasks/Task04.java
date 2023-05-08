package Day04.Tasks;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task04 extends Base {
    //Navigate to website  https://testpages.herokuapp.com/styled/index.html
    //Under the ORIGINAL CONTENTS
    //Click on Alerts
    //Print the URL
    //Navigate back
    //Print the URL
    //Click on Basic Ajax
    //Print the URL
    //Enter value 20 and Enter
    //And then verify Submitted Values is displayed open page
    //Close driver.

    @Test
    public void test04() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //a[@id='alert']
        WebElement alertYazısı= driver.findElement(By.xpath("//a[@id='alerts']"));
        Thread.sleep(1000);
        alertYazısı.click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());


        WebElement basicajaxYazısı= driver.findElement(By.xpath("//a[@id='basicajax']"));

        basicajaxYazısı.click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        //lteq30
        WebElement degergir= driver.findElement(By.id("lteq30"));
        degergir.sendKeys("20");
        Thread.sleep(1000);
        degergir.submit();
        WebElement submitted= driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertTrue(submitted.isDisplayed());
        Thread.sleep(2000);
        driver.quit();
    }
}

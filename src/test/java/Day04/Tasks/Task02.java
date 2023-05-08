package Day04.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task02 {
    //Go to http://automationpractice.pl/index.php
    //When we write an e-mail without the @ sign in the e-mail box and press enter.
    //Let's test the "Invalid email address" warning.
    @Test
    public void test01 () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Go to http://automationpractice.pl/index.php
        driver.get("http://automationpractice.pl/index.php");
        //     //a[@class='login']
        WebElement signLink = driver.findElement(By.xpath("//a[@class='login'][@title='Log in to your customer account']"));

        signLink.click();
        Thread.sleep(3000);
        WebElement email= driver.findElement(By.xpath("//input[@type='text'][@id='email_create']"));
        email.sendKeys("mavanmavan1.com");
        Thread.sleep(3000);
        email.submit();
        Thread.sleep(3000);
      // String expectedUrl="http://automationpractice.pl/index.php?controller=authentication&back=my-account";
      // String errorMasage=driver.getCurrentUrl();
      // Assert.assertEquals(expectedUrl,errorMasage);
        String error = driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText();
        Assert.assertEquals("Invalid email address.",error);

    }

    }



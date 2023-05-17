package Odevler.tasks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_LocatorHomework1 {
   static WebDriver driver=new ChromeDriver();
    /*
    Go to http://automationpractice.com/index.php
    When we write an e-mail without the @ sign in the e-mail box and press enter.
    Let's test the "Invalid email address" warning.
     */
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();


    }
    @Test
    public void test01(){
        driver.get("http://linkedin.com");
        driver.manage().window().maximize();
       WebElement emailKutusu=driver.findElement(By.xpath("//input[@class='text-color-text font-sans text-md outline-0 bg-color-transparent grow'][1]"));
        emailKutusu.sendKeys("mavan71gmail.com");
        //WebElement sifreKutusu
    }
    @After
    public void tearDown(){
       //driver.quit();
    }
}

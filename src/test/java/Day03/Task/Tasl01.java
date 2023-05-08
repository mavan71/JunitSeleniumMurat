package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasl01 {

        @Test
        public void Test01(){
            // Open google home page: https://www.google.com
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            // Verify Title on page
            String pageTitle=driver.getTitle();
            Assert.assertEquals(pageTitle,"Google");
            driver.close();
        }
        @Test
    public void Test02(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            // Verify Current URL on page
            String CurrentUrl= driver.getCurrentUrl();
            String expectedUrl="https://www.google.com/";
            Assert.assertEquals(CurrentUrl,expectedUrl);

            // Close/Quit the browser
            driver.close();
        }

    @Test
    public void Test03(){
        // Open google home page: https://stackoverflow.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stackoverflow.com");
        // Verify Title on page
       String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
       String expectedTitle="Stack Overflow - Where Developers Learn, Share, & Build Careers";
       Assert.assertEquals(pageTitle,expectedTitle);
        // Verify Current URL on page
       String CurrentUrl= driver.getCurrentUrl();
        System.out.println(CurrentUrl);
       String expectedUrl="https://stackoverflow.com/";
       Assert.assertEquals(CurrentUrl,expectedUrl);


        // Close/Quit the browser
        driver.close();
    }

        @Test
    public void Test04(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            // Open google home page: https://www.linkedin.com
            driver.get("https://www.linkedin.com");
            // Verify Title on page
            String pageTitle=driver.getTitle();
            System.out.println(pageTitle);
            String expectedTitle="LinkedIn: Oturum Açın veya Üye Olun";
            Assert.assertEquals(pageTitle,expectedTitle);

            // Verify Current URL on page
            String CurrentUrl=driver.getCurrentUrl();
            System.out.println(CurrentUrl);
            String expectedUrl="https://www.linkedin.com/";
            Assert.assertEquals(CurrentUrl,expectedUrl);
            // Close/Quit the browser
            driver.close();
        }











}

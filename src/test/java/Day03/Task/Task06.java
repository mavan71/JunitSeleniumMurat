package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task06 {



    //• Verify that you are Google in the title.

    @Test
    public void Task06(){
        //• Set Path.
        //• Create chrome driver.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //• Maximize the window.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //• Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        String pagetitle= driver.getTitle();
        String expectedPageTitle="Google";
        Assert.assertEquals(pagetitle,expectedPageTitle);
        driver.close();
    }
}

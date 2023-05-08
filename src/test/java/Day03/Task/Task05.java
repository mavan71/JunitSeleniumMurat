package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task05 {
    @Test
    public void Task05(){
        // Invoke Chrome Driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.get("https://www.facebook.com/");
        // Verify expected equals actual URL.
        String expectedUrl="https://www.facebook.com/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        // Verify expected contains Facebook Word.
        System.out.println(driver.getTitle().contains("Facebook") ? "Test PASSED" : "Test Failed");
        driver.close();

    }
}

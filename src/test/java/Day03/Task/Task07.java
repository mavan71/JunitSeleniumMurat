package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task07 {
    //Do the following tasks by creating 2 different test methods.
    //1- Test if the URL contains Amazon.
    @Test
    public void TAsk07_1(){
        //Go to Amazon homepage.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        String CurrentUrl=driver.getCurrentUrl();

        Assert.assertTrue(CurrentUrl.contains("Amazon"));
        driver.close();


           }
    //2- Test if the title does not contain Facebook.
    @Test
    public void TAsk07_2(){
        //Go to Amazon homepage.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        String pageTitle=driver.getTitle();
        Assert.assertTrue(!pageTitle.contains("Facebook"));
        driver.close();

    }

}

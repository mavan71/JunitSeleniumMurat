package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task08 {
    //Do the following tasks by creating 2 different test methods.
    static WebDriver driver = new ChromeDriver();

    @Before
    public void Before() {
        WebDriverManager.chromedriver().setup();


    }

    //1- Test if the URL contains Amazon.
    @Test
    public void UrlTest() {
        //Go to Amazon homepage.
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        String CurrentUrl = driver.getCurrentUrl();
        Assert.assertFalse("URL Amazon İçermiyor", CurrentUrl.contains("Amazon"));


    }

    //2- Test if the title does not contain Facebook.
    @Test
    public void TitleTest() {
        //Go to Amazon homepage.
        driver.get("https://amazon.com");
        String pageTitle = driver.getTitle();
        Assert.assertFalse(pageTitle.contains("Facebook"));

    }

    @After
    public void After() {
        driver.quit();
    }

}
package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {
    //Invoke Chrome Browser
    //Open URL: https://www.google.com/
    //Maximize the window.
    //Minimize the page.
    //Make the page fullscreen.
    @Test
    public void Test03(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();





    }


}

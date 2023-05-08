package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {

        //web driver maneger class i kullananralk
        WebDriverManager.chromedriver().setup();
        //drive robjesi oluşturulur
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.youtube.com/");

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver.manage().window().maximize();
        driver1.get("https://www.youtube.com");
    }
}

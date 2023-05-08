package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
import java.time.Duration;

public class Task04 {






    // Close the page.
    @Test
    public void Test04(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Go to the Amazon URL : https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // Print the position and size of the page.
        Point amazon =driver.manage().window().getPosition();
        System.out.println("amazon = " + amazon);
        int xcoor=amazon.getX();
        int ycoor=amazon.getY();
        System.out.println("xcoor = " + xcoor);
        System.out.println("ycoor = " + ycoor);
        Dimension sizeAmazon=driver.manage().window().getSize();
        System.out.println("sizeAmazon = " + sizeAmazon);
        int sizeAmazonWidth=sizeAmazon.getWidth();
        int sizeAmazonHeigth=sizeAmazon.getHeight();
        System.out.println("sizeAmazonWidth = " + sizeAmazonWidth);
        System.out.println("sizeAmazonHeigth = " + sizeAmazonHeigth);
        // Adjust the position and size of the page as desired.
        driver.manage().window().setSize(new Dimension(360,580));
        driver.manage().window().setPosition(new Point(100,100));
        // Test that the page is in the position and size you want.
        Point point =new Point(100,100);
        System.out.println((point.equals(new Point(100, 100)) ? "Test PASSED" : "Test FAİLED"));
        System.out.println(driver.manage().window().getSize().equals(new Dimension(516, 580)) ? "Test PASSED" : "Test FAİLED");
        System.out.println(driver.manage().window().getSize());
        driver.close();

    }
}

package Day04.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class Task01 {
    @Test
    public void Test01() throws InterruptedException {
        //Invoke Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Open URL: https://www.google.com/
        driver.get("https://www.google.com/");
        //Maximize the window.
        driver.manage().window().maximize();
        //Print the position and size of the page.
        Point CurrentPoint=driver.manage().window().getPosition();
        int xCoor= CurrentPoint.getX();
        int yCoor= CurrentPoint.getY();

        System.out.println("xCoor = " + xCoor);
        System.out.println("yCoor = " + yCoor);
        //Minimize the page.
        driver.manage().window().minimize();
        //Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(3000);
        //Print the position and dimensions of the page in maximized state.
        Dimension CurrentSize=driver.manage().window().getSize();
        int weigth=CurrentSize.getWidth();
        int heigth=CurrentSize.getHeight();

        System.out.println("weigth = " + weigth);
        System.out.println("heigth = " + heigth);
        //Make the page fullscreen.
        driver.manage().window().fullscreen();
        //Close the Browser.
        driver.close();


    }











}

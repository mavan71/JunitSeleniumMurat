package Odevler.tasks;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class T01_TC extends Base {
        /*
    • Set Path.
    • Create chrome driver.
    • Maximize the window.
    • Open google home page https://www.google.com/
    • Verify that you are Google in the title.
         */
        public static void main(String[] args) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            System.out.println("driver.getTitle() = " + driver.getTitle());
            System.out.println(driver.getTitle().equals("Google") ? "Test Passed" : "Test Failed");
        }
    }


package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Xpath {


    @Test
    public void xPathExercises(){

        //   //tagName[@attributeName1='value1'][@attributeName2='value2'] -> AND mantigi ile baglanir
        //   //tagName[@attributeName1='value1' and @attributeName2='value2'] -> AND mantigi ile baglanir

        // Turkcesi -> attributeName1 i value1 olan VE attributeName2 si value 2 olan tagName elementini bul

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

       WebElement element = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][@type='text']"));
      // WebElement element = driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
        ///html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input//absolute xpath hiç kullanılmaz Bakım maliyeti fazladır
       element.sendKeys("book");
       element.submit();


        //   //input[@att1='value1' or @att2='value2'] -> OR mantigi ile baglanir

        // Turkcesi -> att1 i value1 olan VEYA att2 si value 2 olan input elementini bul.

    }
}
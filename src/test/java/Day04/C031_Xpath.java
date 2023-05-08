package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C031_Xpath {
    @Test
    public void xpathExercises(){
        //    //tagname[@attribute='value']
        //   //tagName[@attributeName1='value1'][@attributeName2='value2'] -> AND mantigi ile baglanir
        //   //tagName[@attributeName1='value1' and @attributeName2='value2'] -> AND mantigi ile baglanir
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        // WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        //WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        WebElement searchField = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' ][@type='text']"));
        searchField.sendKeys("xpath 456 basariyla tamamlandi");
    }
}

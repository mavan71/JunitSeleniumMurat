package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C011_Locators {
    //bir webElementin yerini bulmak için 8 adet LOCATOR var Bunlar:

    //ID
    //NAME
    //TAG
    //CLASS
    //LINK TEXT
    //PARTIAL TEXT
    //CSS SELECTOR
    //XPATH
    @Test
    public void locatorStratejisi(){
        WebDriverManager.chromedriver().setup();
        //id=twotabsearchtextbox
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("TV");
        aramaKutusu.submit();



    }

}

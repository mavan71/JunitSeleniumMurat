package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebElementCommands {


//    sendKeys(String keys) methodu elementimize gonderilen degerleri klavyeyle yazarmis gibi gonderir
//    isDisplayed() bize boolean ifadeler dondurur!!!!!!!!!! Elementin sayfada goruntulenip goruntulenmedigi bilgisini verir
//    isSelected() methodumuz bize elementin secili olup olmadigi bilgisini verir. (checkbox, radio)
//    isEnabled() bir elementin aktif mi degil mi oldugunun bilgisini verir (button ve girdi yapilan elementlerde kullanilabilir)
//    submit() methodu formlari submit etmemize yani gondermemize yardimci olur. ENTER tusunun gorevini gorur.
//    click() methodu bir elemente sol tiklamamizi saglar.
//    getLocation() methodu bize elementin konumunu verir
//    clear() methodu input alanlarindaki yazilarin temizlenmesini saglar.
//    getText() methodu elementin contentini bize verir
//    getAttribute(String key) methodu bize elementin istedigimiz attribute degerini getirir.
//    getSize() elementin boyutunu bize verir.


    @Test
    public void webElementCommands(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Ilk selenium kodumuzdan merhabalar");

        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

        searchButton.click();


    }
}
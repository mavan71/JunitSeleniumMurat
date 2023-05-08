package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C021_WebElementCommand {
    //bir webElementin yerini bulmak için 8 adet LOCATOR var

    //ID
    //NAME
    //TAG
    //CLASS
    //LINK TEXT
    //PARTIAL TEXT
    //CSS SELECTO
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
    public void webElementCommands() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("ilk selenium kodumuzdan merhaba");

        //nav-search-submit-button
        WebElement aramaButtonu = driver.findElement(By.id("nav-search-submit-button"));
        aramaButtonu.click();


    }

    @Test
    public void id() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");

        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
    }

    @Test
    public void name() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");
        //field-keywords
        WebElement aramaKutusu2 = driver.findElement(By.name("field-keywords"));
        aramaKutusu2.sendKeys("bilgisayar");
        aramaKutusu2.submit();
    }

    @Test
    public void className() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");
        //field-keywords
        WebElement aramaKutusu2 = driver.findElement(By.className("nav-input "));
    }

    @Test
    public void tagName() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");
        //field-keywords
        WebElement aramaKutusu2 = driver.findElement(By.tagName("input"));
        aramaKutusu2.sendKeys("bilgisayar");
        aramaKutusu2.submit();

    }
//linkText sadece a taglarında kullanılır

    @Test
    public void linkText() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");
        //field-keywords
        WebElement link2 = driver.findElement(By.linkText("Shop great deals now"));

        link2.click();
    }

    @Test
    public void partialLinkText() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        driver.get("https://amazon.com");
        //field-keywords
        WebElement link2;
        link2 = driver.findElement(By.partialLinkText("Shop great"));
        ///html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
        //Absolute xpath: biz bunu kullqnmıyoruz bakım maliyeti fazladır

        link2.click();
    }
}

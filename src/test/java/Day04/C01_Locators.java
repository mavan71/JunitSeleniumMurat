package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Locators {

        // Selenium da 8 adet locator stratejisi vardir.

        // LOCATORS

        // ID
        // ID locator aslinda bir webelementin id attribute udur.
        // id = "value" seklindeyse biz elementi value ile buluruz

        // NAME
        // NAME locator aslinda bir webelementin name attribute udur.
        // name = "value" seklindeyse biz elementi value ile buluruz

        // CLASS
        // CLASS locator aslinda bir webelementin class attribute udur.
        // class = "value" seklindeyse biz elementi value ile buluruz

        // TAG
        // HTML elementinin tagleri ile locate etme stratejisidir.
        // <tagName></tagName> ise biz bu elementi tagName degeri ile locate ederiz.


        // LINK TEXT

        // PARTIAL LINK TEXT

        // CSS SELECTOR

        // XPATH

    @Test
    public void locatorStratejies(){

        // id, name, class, tag, link text, partial link text, css selector, xpath

        // id = twotabsearchtextbox

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        // driver.findElement() methodu bizim acik olan sitede veya sayfada elementleri bulmamizi saglar
        // Bu elementleri bulurken locator stratejimizi By.{locatorStrategy} seklinde yazariz ve degerini method icerisine gondeririz

        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));

    }


    @Test
    public void id(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
    }

    @Test
    public void name(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.name("field-keywords"));
    }

    @Test
    public void className(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.className("nav-input"));


    }

    @Test
    public void tagName(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.tagName("input"));

    }

    @Test
    public void linkText(){

        // LinkText locator u sadece <a> elementlerinde kullanilir.

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement link = driver.findElement(By.linkText("Shop great deals now"));
        link.click();


    }

    @Test
    public void partialLinkText(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement link = driver.findElement(By.partialLinkText("Shop great"));
        link.click();

    }

    @Test
    public void cssSelector(){

    }

    @Test
    public void xpath(){

        // /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input -> absolute xpath hic kullanilmaz. Bakim maaliyeti fazladir.

        // relative xpath -> syntax: //tagName[@attribute='value']

        // id locator id='twotabsearchtextbox' By.id("twotabsearchtextbox")
        // xpath locator -> By.xpath("//input[@id='twotabsearchtextbox']")

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

       // WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchField = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        searchField.sendKeys("xpath 333 basariyla tamamlandi");
    }


}
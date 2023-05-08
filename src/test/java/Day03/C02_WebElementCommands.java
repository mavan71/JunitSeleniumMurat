package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebElementCommands {
    //    sendKeys() command methodu elemntimize gönderilen değerleri klavye ile yazarmış gibi gönderir.
    //    isDisplayed() command//görüntülebiliyormu//bize boolen ifadeler döndürür!!!!!!!!.elementin sayfada görüntülenip görüntülenmediği bigisini verir.
    //    isSelected() command //seçile biliyormu//methodumuz bize elementin seçili olup omadığı bilgisini verir
    //    isEnabled() command//etkinmi//methodumuz bir elementin aktif değilmi bilgisini verir.
    //    submit() command //formlarda kullanılır// methodu formları submit(gönderme) etmemize yardımcıolur .ENTER tuşunun görevini görür
    //    click() command //methodu bir elemente sol tıklamamızı sağlar
    //    getLocation() methodu bize elementin konumunu verir
    //    clear() methodu input alanlarindaki yazilarin temizlenmesini saglar.
    //    getText() methodu elementin contentini bize verir
    //    getAttribute(String key) methodu bize elementin istedigimiz attribute degerini getirir.
    //    getSize() elementin boyutunu bize verir.
    @Test
    public void webElementCommands(){
    //WebDriverManager.chromedriver().setup();
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    //    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com");
       // id= twotabsearchtextbox

    //WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

       // driver.findElement(); methodu bizim açık olan sitede veye sayfada elementleri bulmamızı sağlar
        searchBox.sendKeys("ilk selenium kodumuzdan merhabalar");
        //sendKeys methodu searchbox kutumuza yazı yazmamızı sağlar.
        //searchBox.submit();
       // searchBox.clear();

    WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));

        searchButton.click();




    }
    @Test
    public void id(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
    }
    @Test
    public void name(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
       // field-keywords
        WebElement searchField=driver.findElement(By.name("field-keywords"));
    }
    @Test
    public void className(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement searchField=driver.findElement(By.className("nav-input"));

    }
    @Test
    public void tagName(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement searchField=driver.findElement(By.tagName("input"));
    }
    @Test
    public void linkText(){
        //linkText locatoru sadece <a> elementlerinde kullanılır
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement Link=driver.findElement(By.linkText("Shop great deals now"));
        Link.click();
      
    }
    @Test
    public void partialLinkText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

      WebElement Link=driver.findElement(By.partialLinkText("Shop great"));
        Link.click();
    }
    @Test
    public void cssSelector(){

    }
    @Test
    public void xpath(){


       // /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input--> Absolute  xpath hiç kullanılmaz bakım faaliyeti fazladır

        //relative xpath --> syntax://tagName[@attribute='value']
        //id locator id='twotabsearchtextbox' By.id("twotabsearchtextbox")
        //xpath locator-->//input[@id='twotabsearchtextbox']


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath( "//input[@id='twotabsearchtextbox']"));//input elamanını arıyorum hangi input id si twotabsearchtextbox olan input
        searchBox.sendKeys("xpath  başarıyla tamamlandı");



    }


}

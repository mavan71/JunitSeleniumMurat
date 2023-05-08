package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task02 {

            ////- Chrome Tarayıcıyı Çalıştır
    //    //- URL'ye gidin: https://clarusway.com/
    //    //- URL'ye gidin: https://amazon.com/
    //    //- Geri komutunu kullanarak Clarusway'e geri dönün.
    //    //- Geçerli URL'nin https://clarusway.com/ olduğunu doğrulayın
    //    //- forward komutunu kullanarak tekrar amazon web sitesine geri dönün
    //    //- Geçerli URL'nin https://amazon.com/ olduğunu doğrulayın
    //    //- Yenileme komutunu kullanarak Tarayıcıyı yenileyin.
    //    //- Tarayıcıyı kapatın.

    @Test
    public void Test02(){
        //- Invoke Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //- Navigate to URL: https://clarusway.com/
        driver.get("https://clarusway.com/");
        //- Navigate to URL: https://amazon.com/
        driver.get("https://amazon.com/");
        //- Come back to the Clarusway using the back command.
        driver.navigate().back();
        //- Verify the current URL is https://clarusway.com/
        String CurrentUrl=driver.getCurrentUrl();
        System.out.println(CurrentUrl);
        String actualyUrl="https://clarusway.com/";
        Assert.assertEquals(CurrentUrl,actualyUrl);
        //- Again go back to the amazon website using forward command
        driver.navigate().forward();
        //- Verify the current URL is https://amazon.com/
        String CurrenyUrl2=driver.getCurrentUrl();
        System.out.println(CurrenyUrl2);
        String avtualyUrl2="https://www.amazon.com/";
        Assert.assertEquals(CurrenyUrl2,avtualyUrl2);
        //- Refresh the Browser using refresh command.
        driver.navigate().refresh();
        //- Close the Browser.

        driver.quit();

    }

}

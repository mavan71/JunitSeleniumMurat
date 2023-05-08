package Day12;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class C04_Screenshots extends Base {


    @Test
    public void screenshots() throws IOException {

        // ekran goruntusu alacak objemizi olusturuyoruz

        // daha sonra ekran goruntusu alma methodunu cagiriyoruz alinan ekran goruntusunu sakliyoruz

        // Son olarak alinan goruntuyu dosyaya yaziyoruz (.png, .jpg)

        driver.get("https://www.linkedin.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        //Iki farkli copyFile methodundan istediginizi kullanabilirsiniz

        FileUtils.copyFile(source, new File(".\\test-output\\photo.png"));
        FileHandler.copy(source, new File(".\\test-output\\photo.png"));


    }

}

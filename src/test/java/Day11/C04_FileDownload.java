package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends Base {

    //https://the-internet.herokuapp.com/download
    //Download testing.pdf
    //Verify if the file download succesfully

    @Test
    public void fileDownload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("testing.pdf")).click();
        Thread.sleep(2000);
        //Download Location

        String path =System.getProperty("user.home")+
                System.getProperty("file.separator")+"Downloads"+
                System.getProperty("file.separator")+"testing.pdf";
        boolean isExists= Files.exists(Paths.get(path));
        Assert.assertTrue(isExists);
        driver.quit();
    }


}

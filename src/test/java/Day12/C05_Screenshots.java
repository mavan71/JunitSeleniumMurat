package Day12;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C05_Screenshots extends Base {

    @Test
    public void screenshot() throws IOException {
        driver.get("https://www.linkedin.com/");

        WebElement username = driver.findElement(By.xpath("//icon[@data-test-id]"));
        File source = username.getScreenshotAs(OutputType.FILE);

        String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
        System.out.println("date = " + date);

        String path = ".\\test-output\\screenshot"+ date +".png";

        File destination = new File(path);
        FileHandler.copy(source, destination);
    }
}

package Day04.Tasks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task03 extends Base {
    //Go to http://www.google.com
    //Type "Green Mile" in the search box and print the number of results.
    //Type "Premonition" in the search box and print the number of results.
    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.



    @Test
    public void test01(){
        driver.get("http://www.google.com");
       //id=APjFqb
        WebElement searchBox= driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Green Mile");
        searchBox.submit();
        //div[@id='result-stats']
        WebElement sonuc= driver.findElement(By.xpath("//div[@id='result-stats']"));

        System.out.println("sonuc = " +driver.findElement(By.xpath("//div[@id='result-stats']")).getText() );
        driver.quit();
    }
}

package Day06.Tasks;

import Utilities.Base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class task01 extends Base {
    //Go to http://www.google.com
    //Type "Green Mile" in the search box and print the number of results.
    //Type "Premonition" in the search box and print the number of results.
    //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
@Test
    public void test01(){
    driver.get("http://www.google.com");
    WebElement searcBox= driver.findElement(By.id("APjFqb"));
    searcBox.sendKeys("Green Mile"+ Keys.ENTER);
    WebElement sonuc= driver.findElement(By.xpath("//div[@id='result-stats']"));
    System.out.println("sonuc :" +sonuc.getText());


}
@Test
    public void test02(){
   driver.get("https://www.google.com");
    WebElement searcBox= driver.findElement(By.id("APjFqb"));
    searcBox.sendKeys("Premonition"+ Keys.ENTER);
    WebElement sonuc= driver.findElement(By.xpath("//div[@id='result-stats']"));
    System.out.println("sonuc :" +sonuc.getText());

}
    @Test
    public void test03(){
        driver.get("https://www.google.com");
        WebElement searcBox= driver.findElement(By.id("APjFqb"));
        searcBox.sendKeys("The Curious Case of Benjamin Button"+ Keys.ENTER);
        WebElement sonuc= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("sonuc :" +sonuc.getText());

    }
}


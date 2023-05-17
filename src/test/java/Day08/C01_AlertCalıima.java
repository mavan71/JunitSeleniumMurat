package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_AlertCalıima extends Base {

    //o to URL: http://demo.automationtesting.in/Alerts.html
    //Click "Alert with OK" and click 'click the button to display an alert box:’
    //Accept Alert(I am an alert box!) and print alert on console.
    //Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
    //Cancel Alert  (Press a Button !)
    //Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
    //And then sendKeys «BootcampCamp» (Please enter your name)
    //Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.

    @Test
    public void alerts() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //https://the-internet.herokuapp.com/basic_auth
        // Click for JS Alert Buton a tıkla

        //WebElement Alert1= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        List<WebElement>buttons=driver.findElements(By.tagName("button"));//3 tane button var 0,1,2, indexlerde
        //get(0).0.index (button)
        //get(1).1.index (button)
        //get(2).2.index (button)
        buttons.get(0).click();

        //Alert teki OK butonuna tıkla
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        //JS confirm butonuna tıkla
        buttons.get(1).click();
        Thread.sleep(3000);
        //Alerteki cansel butonuna tıkla
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        //JS prompt butonuna tıkla
        buttons.get(2).click();
        //Alerte Murat AVAN yaz ve OK a tıkla
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Murat AVAN");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }
}

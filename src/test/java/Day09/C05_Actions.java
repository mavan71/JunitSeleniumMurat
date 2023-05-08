package Day09;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C05_Actions extends Base {

        // https://www.amazon.com/ a git
        // Accounts and Lists linkinin uzerine gel
        // Cikan pencerede Orders linkine tikla
        // Login ekraninin acildigini dogrula

    @Test
    public void exercise(){

        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        WebElement accountsLists = driver.findElement(By.id("nav-link-accountList"));
        WebElement orders = driver.findElement(By.id("nav_prefetch_yourorders"));

        actions.moveToElement(accountsLists).click(orders).perform();

        Assert.assertTrue(driver.getTitle().contains("Amazon Sign-In"));

    }
}

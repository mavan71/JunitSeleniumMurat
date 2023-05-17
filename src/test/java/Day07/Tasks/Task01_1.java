package Day07.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Task01_1 extends Base {
    @Test
    public void getOptions() {
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropdown);

        List<WebElement> optionList = select.getOptions();
        List<String> list = new ArrayList<String>();
        for (WebElement option : optionList) {
            list.add(option.getText());
        }
        System.out.println(("Options : ") + list);
        System.out.println(("Option List Size =" + list.size()));
        Assert.assertTrue(list.contains("Black"));
        System.out.println("First Selected Option : " + select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Yellow");
    }
}

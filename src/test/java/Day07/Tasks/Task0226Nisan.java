package Day07.Tasks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Task0226Nisan extends Base {
    //Go to URL: https://demoqa.com/select-menu
    //Get all the options of the dropdown
    //Options size
    //Print all test
    //Verify the dropdown has option "Black"
    //Print FirstSelectedOptionTest
    //Select option "Yellow"
    @Test
    public void test01(){
        driver.get("https://demoqa.com/select-menu");
        WebElement oldStyleSelectMenu= driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(oldStyleSelectMenu);
        List<WebElement> optionsList=select.getOptions();
        List<String>list= new ArrayList<String>();
        for (WebElement option: optionsList) {
            list.add(option.getText());
        }
            System.out.println("optionlist = " + list);
            System.out.println("list.size() = " + list.size());
            Assert.assertTrue(list.contains("Black"));
            System.out.println("FirstSelectedOptionTest = " + select.getFirstSelectedOption().getText());
            select.selectByVisibleText("Yellow");
    }
}

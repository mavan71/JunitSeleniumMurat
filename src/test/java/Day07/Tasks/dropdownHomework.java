package Day07.Tasks;


import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class dropdownHomework extends Base {

        /*
        Go to URL: https://the-internet.herokuapp.com/dropdown
    Create method selectByIndexTest and Select Option 1 using index .
    Create method selectByValueTest Select Option 2 by value.
    Create method selectByVisibleTextTest Select Option 1 value by visible text.
    Create method printAllTest Print all dropdown value.
    Verify the dropdown has Option 2 text.
    Create method printFirstSelectedOptionTest Print first selected option.
    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

         */

    @Test
    public void herOkuAppTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.xpath("//select[@id='dropdown']"));

        selectByIndexTest(dropdownList, 1);

        selectByValueTest(dropdownList, "2");

        selectByVisibleTextTest(dropdownList, "Option 1");

        System.out.println(printAllTest(dropdownList));

        System.out.println(verifyHasOption2(dropdownList, "Option 2"));

        printFirstSelectedOptionTest(dropdownList);

        Select select = new Select(dropdownList);
        List <WebElement> list = select.getOptions();
        Assert.assertEquals("Expected Is Not Equal Actual",3,list.size());

    }

    public static void selectByIndexTest(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);

    }

    public static void selectByValueTest(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public static void selectByVisibleTextTest(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static List<String> printAllTest(WebElement element) {
        Select select = new Select(element);
        List<String> optionList = new ArrayList<>();
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            if (option.isEnabled()) {
                optionList.add("Enabled Option: " + option.getText());
            } else System.out.println(option.getText() + " is not enabled");
        }
        return optionList;
    }

    public static boolean verifyHasOption2(WebElement element, String value) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        List<String> optionList = options.stream().map(WebElement::getText).collect(Collectors.toList());
        return optionList.contains(value);
    }

    public static void printFirstSelectedOptionTest(WebElement element) {
        Select select = new Select(element);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());
    }
}


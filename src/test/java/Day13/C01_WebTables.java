package Day13;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WebTables extends Base {


    @Test
    public void test01() {

        driver.get("https://demo.guru99.com/test/web-table-element.php");
        WebElement tableData = driver.findElement(By.xpath("//table[@class='dataTable']//tbody"));
        WebElement row1cell3 = tableData.findElement(By.xpath(".//tr[1]//td[3]"));//webElementin altında WebElement arandığında '.' konması gerekiyor.
        String text = row1cell3.getText();
        System.out.println("text = " + text);
        //Tabloda gezinmek için iç içe for döngüleriyle dolaşacağız

        int satırSayısı=tableData.findElements(By.xpath(".//tr")).size();
        int sutunSayısı=tableData.findElements(By.xpath(".//tr[1]//td")).size();
        for (int i = 1; i < satırSayısı+1; i++) {
            for (int j = 1; j < sutunSayısı+1; j++) {
                WebElement currentCell= tableData.findElement(By.xpath(".//tr[" + i + "]//td[" + j + "]"));
                String cellValue=currentCell.getText();
                System.out.print(cellValue   + " - ");
            }
            System.out.println();
        }


    }


}

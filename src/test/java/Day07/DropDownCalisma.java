package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownCalisma extends Base {
    // Dropdownlar ozel etkilesimler gerektirdiginden dolayi Selenium bize dropdownlar icin ayri bir class olusturmus durumda.
    // Class -> Select

    // Dropdownlar ile calisirken yapilacak islem
    //    1- <select> elementini locate et
    //    2- select elementini kullanarak Select objesi olustur -> Select select = new Select(element)
    //    3- Select objesini kullanarak ozel methodlardan yararlan

    @Test
    public void dropdown(){
        driver.get("https://demoqa.com/select-menu");
       // <!--(//div[@class=' css-1wa3eu0-placeholder'])[1] -->
        WebElement selectOne=driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[2]"));
        Select select=new Select(selectOne);
       // oldSelectMenu

    }
    @Test
    public void dropdownSelect() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        // <!--(//div[@class=' css-1wa3eu0-placeholder'])[1] -->
        WebElement oldSelectMenu=driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(oldSelectMenu);
        // oldSelectMenu

        // Select elementinde secim yapmamizi saglayan 3 method
        // 1- selectByIndex() -> option elementinin indexi
        // 2- selectByValue() -> option elemeninin value attribute u
        // 3- selectByVisibleText() -> option elementinin gorunur yazisi (contenti)
        select.selectByIndex(4);//5. sıradaki purple seçilir
        Thread.sleep(3000);
        select.selectByValue("2");
        Thread.sleep(3000);
        select.selectByVisibleText("Magenta");
        Thread.sleep(3000);
        //select.deselectAll(); deselect methodları sadece multiselect le rile kullanılıyor


        //Select elementlerinde info amaciyla kullanilan methodlar
//        select.getAllSelectedOptions(); -> multi selectte secili tum degerleri bize return eden methoddur.
//        select.getFirstSelectedOption(); -> Secili ilk option elementini bize getirir.
//        select.getOptions(); -> select elementinin tum optionlarini liste halinde return eder
//        select.isMultiple(); -> select elementinin multiple secime uygun olup olmadigni bize boolean olarak return eder.


    }
    @Test
    public void getOptionsUsage(){
        driver.get("https://demoqa.com/select-menu");
        // <!--(//div[@class=' css-1wa3eu0-placeholder'])[1] -->
        WebElement oldSelectMenu=driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(oldSelectMenu);

        // getOptions methodu sayesinde elimize optionlar List<WebElement> olarak gecmis olur
        // Bu listeyi lambdanin map methodunu kullanarak biz bu elementleri value veya textlerini alabiliriz
        List<WebElement> options=select.getOptions();
        List<String>optionvalues=options.stream().map(x->x.getAttribute("value")).collect(Collectors.toList());
        System.out.println(optionvalues);
        List<String>optionvalues1=options.stream().map(x->x.getText()).collect(Collectors.toList());
        System.out.println(optionvalues1);


    }
}

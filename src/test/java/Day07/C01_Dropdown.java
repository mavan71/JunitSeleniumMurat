package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C01_Dropdown extends Base {

        // Dropdownlar ozel etkilesimler gerektirdiginden dolayi Selenium bize dropdownlar icin ayri bir class olusturmus durumda.
        // Class -> Select

        // Dropdownlar ile calisirken yapilacak islem
        //    1- <select> elementini locate et
        //    2- select elementini kullanarak Select objesi olustur -> Select select = new Select(element)
        //    3- Select objesini kullanarak ozel methodlardan yararlan


    @Test
    public void dropdownDiv(){

        driver.get("https://demoqa.com/select-menu");

        //    1- <select> elementini locate et
        WebElement selectOne = driver.findElement(By.id("selectOne"));

        //    2- select elementini kullanarak Select objesi olustur -> Select select = new Select(element)
        Select select = new Select(selectOne);

        // Select class i kullanilirken elementimiz kesinlikle ve kesinlikle <select> olmalidir.
        // <select> olmadiginda UnexpectedTagNameException firlatilir

    }


    @Test
    public void dropdownSelect() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");

        //    1- <select> elementini locate et
        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));

        //    2- select elementini kullanarak Select objesi olustur -> Select select = new Select(element)
        Select select = new Select(oldSelectMenu);

        // Select elementinde secim yapmamizi saglayan 3 method
        // 1- selectByIndex() -> option elementinin indexi
        // 2- selectByValue() -> option elemeninin value attribute u
        // 3- selectByVisibleText() -> option elementinin gorunur yazisi (contenti)

        select.selectByIndex(4); // 5. siradaki 'Purple' secilir
        Thread.sleep(2000);
        select.selectByValue("red"); // value attribute u 'red' olan 'Red' secilir
        Thread.sleep(2000);
        select.selectByVisibleText("Magenta"); //Contenti 'Magenta' olan 'Magenta' secilir

        //Select elementinde secim kaldirmamizi saglayan methodlar. Sadece multi select ile kullanilabilen methodlardir.
        // 1- deselectByIndex() -> option elementinin indexi
        // 2- deselectByValue() -> option elemeninin value attribute u
        // 3- deselectByVisibleText() -> option elementinin gorunur yazisi (contenti)
        // 4- deselectAll() -> Butun secimleri kaldirir.

        //Select elementlerinde info amaciyla kullanilan methodlar
//        select.getAllSelectedOptions(); -> multi selectte secili tum degerleri bize return eden methoddur.
//        select.getFirstSelectedOption(); -> Secili ilk option elementini bize getirir.
//        select.getOptions(); -> select elementinin tum optionlarini liste halinde return eder
//        select.isMultiple(); -> select elementinin multiple secime uygun olup olmadigni bize boolean olarak return eder.

    }

    @Test
    public void getOptionsUsage(){

        //EXTRA

        driver.get("https://demoqa.com/select-menu");
        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelectMenu);

        // getOptions methodu sayesinde elimize optionlar List<WebElement> olarak gecmis olur
        // Bu listeyi lambdanin map methodunu kullanarak biz bu elementleri value veya textlerini alabiliriz

        List<WebElement> options = select.getOptions();

        //List<String> optionvalues = options.stream().map(x -> x.getAttribute("value")).toList(); Hata verdi

  //      System.out.println(optionvalues);

    }



}




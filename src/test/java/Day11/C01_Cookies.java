package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class C01_Cookies extends Base {

        //    Go to URL: https://kitchen.applitools.com/ingredients/cookie
//    Get Cookie.
//    Find the total number of cookies.
//    Print all the cookies.
//    Add Cookie.
//    Edit Cookie.
//    Delete Cookie.
//    Delete All Cookies.

    public void printCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();

        Iterator<Cookie> i = cookies.iterator();

        // Print all cookies
        while(i.hasNext()){
            Cookie currentCookie = i.next();

            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("Name = " + name + ", Value = " + value);
        }
        System.out.println("\n");
    }

    @Test
    public void test01(){


        driver.get("https://kitchen.applitools.com/ingredients/cookie");

        Set<Cookie> cookies = driver.manage().getCookies();

        // Number of all cookies
        int size = cookies.size();
        System.out.println("Cookies size = " + size);

        // Print all cookies
        printCookies();

        // Add cookie

        System.out.println("Cookie ekleniyor....");

        Cookie cookie = new Cookie("dessert", "gullac");

        driver.manage().addCookie(cookie); // dessert = gullac

        // protein = chicken
        // vegetable = broccoli
        // dessert = gullac
        printCookies();

        Assert.assertEquals("Cookie ekleme islemi basarisiz!",size+1, driver.manage().getCookies().size());
        Assert.assertEquals(cookie.getValue(), driver.manage().getCookieNamed(cookie.getName()).getValue());

        // Edit cookie
        System.out.println("Cookie update ediliyor...");
        // Cookie eklemek icin ayrica bir method yoktur. Varolan isimde yeni bir cookie ekledigimizde cookinin degeri update edilecektir
        // Yani varolan name ile bir cookie eklemeye biz edit cookie demis oluyoruz.

        driver.manage().addCookie(new Cookie("dessert", "baklava"));

        printCookies();


        //Delete Cookie
        System.out.println("Cookie siliniyor...");
        driver.manage().deleteCookieNamed("vegetable");
        Assert.assertEquals(size, driver.manage().getCookies().size());

        printCookies();

        System.out.println("Cookieler siliniyor...");
        driver.manage().deleteAllCookies();

        printCookies();

    }
}

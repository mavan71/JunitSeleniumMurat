package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertions {

    public int divide(int a, int b){
        return a/b;
    }
    //Assert idida ediyorum demektir


    //divide diye bir fonksiyon var iki paremetre alır ilki ikinciye böler bu methodu test edebilirimisin?
    //senerya 1: Birbirine tam bölünen iki sayı methoda sağlanırsa çıktı bölümleri olmalı .Orn 10/2==5 olmalı
    //senaryo2 birbirine tam bölünemeyen iki sayı methoda sağlanırsa çıktı? 5/2==2.5
    //senaryo3 ikinci sayı sıfır ise method -1 olmalı ORN 9/0==-1 olmalı

    @Test
    public void senaryo1(){
       int expected=5;
       int actual=divide(10,2);
       //Assert equals: iki değerin eşitliğini kontrol eder
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void senaryo2(){
        double expected=2.5;//2.5.....
        double actual=divide(5,2);//2
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertTrue(expected==actual);//2.5!=2
         }

}

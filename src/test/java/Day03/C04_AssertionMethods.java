package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethods {
    @Test
    public void assertEqualsTest(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void assertTrueTest(){
        Assert.assertTrue("Bu ifade doğru değil", false);//hepsine doğru olmadığında çalışan mesaj yazabiliyoruz.
    }
    @Test
    public void assertFalseTest(){
        Assert.assertFalse(false);
    }
    //parantez içi true olması durumunda testimiz failed false olması durumunda testimiz passed
    @Test
    public void assertNullTest(){
        Assert.assertNull("Bu değer null değil" , null);
    }
    //Bir parametre alır parametre null ise test passed, null değil ise test failed
    @Test
    public void assertNotNullTest(){
        Assert.assertNotNull(5);
    }
    //Bir parametre alır parametre null değil ise test passed, null ise test failed
    @Test
    public void assertSameTest(){
        Assert.assertSame("Karl","Karl");
    }
    //obje kontrolu değer ve adresler aynı olmalı
    @Test
    public void assertNotSameTest1(){
        Assert.assertNotSame(new String("Karl"),new String("Karl"));
    }
    @Test
    public void assertSameTest1(){
        Assert.assertSame(new String("Karl"),new String("Karl"));
    }
    @Test
    public void assertArrayEquals(){// uzunlukları ve aynı indexdeki elamanlalrı aynı olmalıdır
        int arr1[]={1,2,3,4,5}, arr2 []={5,4,3,2,1};
        Assert.assertArrayEquals(arr1,arr2);
    }
    @Test
    public void assertEqualsWithMessage(){

        Assert.assertEquals("Bu degerler esit değil!!!", 5, 2);
    }


}

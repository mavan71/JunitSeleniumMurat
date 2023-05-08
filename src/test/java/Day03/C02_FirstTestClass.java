package Day03;


import org.junit.*;

public class C02_FirstTestClass {


    @Before
    public void beforeTestMethod(){

        System.out.println("\tBrowser açılma işlemleri yapıldı.....");
    }

    @Test
       public void test01(){
        System.out.println("\t\tTest1 executed...");
    }

    @Test
    public void test02(){
        System.out.println("\t\tTest2 executed...");
    }
    @Test
    @Ignore
    public void test03(){
        System.out.println("\t\tTest3 executed...");
    }

    @After
    public void afterTestMethod(){
        System.out.println("\tBrowser kapatıldı.....");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Before Class çalıştı");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("After Class Çalıştı");
    }

}

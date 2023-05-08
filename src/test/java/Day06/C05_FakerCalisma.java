package Day06;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_FakerCalisma extends Base {

    @Test
    public void fakerUsage(){
        Faker faker=new Faker();
        String isim=faker.name().nameWithMiddle();
        System.out.println("isim = " + isim);
        String address=faker.address().fullAddress();
        System.out.println("address = " + address);
        String TelNumbur= faker.phoneNumber().phoneNumber();
        System.out.println("TelNumbur = " + TelNumbur);

    }
}

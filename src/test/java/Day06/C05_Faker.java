package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_Faker {


    @Test
    public void fakerUsage(){

        Faker faker = new Faker();
        
        String isim = faker.name().nameWithMiddle();
        String city = faker.address().fullAddress();
        String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println(isim);
        System.out.println(city);
        System.out.println(phoneNumber);


    }

}
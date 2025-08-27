package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGeneration {

    public static Faker faker = new Faker();

    public String getFirstLastName() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getPhone() {
        Faker faker = new Faker(new Locale("ru"));
        return  "7" + faker.phoneNumber().subscriberNumber(10).replaceAll("[^\\d]", "");
    }

    public String getPassword(){
        return faker.internet().password(8, 16, true, true,
                true);
    }
}
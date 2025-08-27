package data;

import com.github.javafaker.Faker;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class DataGeneration {

    public static Faker faker = new Faker();

    public String getFirstLastName() {
        return faker.name().firstName() + " " + faker.name().lastName();
    }
}
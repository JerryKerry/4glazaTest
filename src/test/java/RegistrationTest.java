import com.codeborne.selenide.Selenide;
import data.DataGeneration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {

    private String password;

    private DataGeneration data = new DataGeneration();

    String firstLastName = data.getFirstLastName();
    String email = data.getEmail();
    String phone = data.getPhone();

    private String url = "https://4glaza.ru/auth/registration/";


    @Test
    @DisplayName("Проверка регистрации нового пользователя")
    public void registrationTest() {
        String password = data.getPassword();

        step("Открываем главную страницу", () ->{
            open("https://4glaza.ru/") ;
        });

        step("Кликаем геопозицию", () ->{
            mainPage.clickGeoButton();
        });

        step("Кликаем на иконку входа", () ->{
            mainPage.clickEntryButton();
        });

        step("Кликаем на - 'Нет аккаунта? Зарегистрируйтесь'", () ->{
            mainPage.registrationButtonClick();
        });


        step("Вводим ФИО", () ->{
            registrationPage.setFirstLastName(firstLastName);
        });

        step("Вводим E-mail", () ->{
            registrationPage.setEmailName(email);
        });

        step("Вводим телефон", () ->{
            registrationPage.setPhone(phone);
        });

        step("Вводим пароль", () ->{
            registrationPage.setPassword(String.valueOf(password));
        });

        step("Повторяем ввод пароля", () ->{
            registrationPage.setPasswordAgain(String.valueOf(password));
        });

        step("Одобряем обработку ПДН", () ->{
            registrationPage.clickProcessingOfPersonalData();
        });

        step("Кликаем на 'Зарегестрироваться сейчас'", () ->{
            registrationPage.clickRegistrationButton();
        });

        Selenide.sleep(1000000);

    }
}

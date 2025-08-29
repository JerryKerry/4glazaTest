import data.DataGeneration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {

    private DataGeneration data = new DataGeneration();

    String firstLastName = data.getFirstLastName();
    String email = data.getEmail();
    String phone = data.getPhone();

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка создания нового пользователя")
    void registration() {
        String password = data.getPassword();

        step("Открываем страницу регистрации", () -> {
            registrationPage.openPage();
        });

        step("Заполняем форму данными", () -> {
            registrationPage.setFirstLastName(firstLastName).setEmailName(email)
                    .setPhone(phone).setPassword(String.valueOf(password)).setPasswordAgain(String.valueOf(password));
        });

        step("Одобряем обработку ПДН", () -> {
            registrationPage.clickProcessingOfPersonalData();
        });

        step("Кликаем на 'Зарегестрироваться сейчас'", () -> {
            registrationPage.clickRegistrationButton();
        });

        step("Проверяем отображение алерта", () -> {
            registrationPage.visibleAlertSuccess();
        });
    }
}

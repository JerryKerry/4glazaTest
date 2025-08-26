import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class RegistrationTest extends TestBase {

    @Test
    @DisplayName("Проверка регистрации нового пользователя")
    public void registrationTest() {
        step("Открываем главную страницу", () ->{
            open("https://4glaza.ru/") ;
        });

        step("Кликаем на иконку входа", () ->{
            mainPage.clickEntryButton();
        });

        step("Кликаем на Нет аккаунта? Зарегистрируйтесь", () ->{
            mainPage.registrationButton();
        });
    }
}

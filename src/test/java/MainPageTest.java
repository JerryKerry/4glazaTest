import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {

    private final String registrationUrl = "https://4glaza.ru/auth/registration/";

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка редиректа на страницу авторизации ")
    void redirectToRegistrationPage() {

        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });

        step("Редирект на страницу регистрации", () -> {
            mainPage.clickEntryButton().registrationButtonClick();
            getUrl(registrationUrl);
        });
    }

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка информации в разделе 'О магазине' на странице 'О компании'")
    void mainPageTest() {

        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });

        step("Редирект на страницу о окмпании", () -> {
            mainPage.clickCompanyButton();
        });

        step("Проверка страницы", () -> {
            companyPage.checkStoreText();
        });
    }
}

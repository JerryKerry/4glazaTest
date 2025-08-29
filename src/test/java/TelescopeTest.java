import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TelescopeTest extends TestBase {

    private final String telescopeUrl = "https://4glaza.ru/katalog/teleskopy/";

    @Test
    @Tag("SMOKE")
    @DisplayName("Проверка перехода в каталог телескопов")
    void telescopeCatalog() {

        step("Открываем главную страницу", () -> {
            open(baseUrl);
        });

        step("Поверяем редирект на страницу телескопов", () -> {
            mainPage.clickCatalog().clickCatalogTelescopeButton();
            getUrl(telescopeUrl);
        });
    }
}

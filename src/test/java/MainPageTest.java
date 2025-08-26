
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {

    @Test
    @DisplayName("Проверка страницы ")
    void mainPageTest() {
        step("Открываем страницу поиска вакансий", () ->{
            open("https://4glaza.ru/") ;
        });

        step("Кликам на гео расположение", () ->{
            mainPage.clickGeoButton();
        });
        step("Кликам на каталог", () ->{
            mainPage.clickCatalog();
        });
    }
}

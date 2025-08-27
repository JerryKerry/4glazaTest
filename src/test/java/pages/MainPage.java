package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement
            telescopeButton = $(byText("Телескопы")),
            catalogButton = $(byText("Каталог")),
            geoButton = $(byText("Да")),
            entryButton = $(byText("Вход")),
            registrationButton = $(byText("Нет аккаунта? Зарегистрируйтесь"));

    public void registrationButtonClick() {
        registrationButton.click();
    }

    public void clickCatalog() {
        catalogButton.click();
    }

    public void clickTelescopeButton() {
        telescopeButton.click();
    }

    public void clickGeoButton() {
        geoButton.click();
    }
    public void clickEntryButton() {
        entryButton.click();
    }

}

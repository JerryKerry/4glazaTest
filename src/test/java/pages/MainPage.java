package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private SelenideElement
            catalogButton = $(byText("Каталог")),
            entryButton = $(byText("Вход")),
            registrationButton = $(byText("Нет аккаунта? Зарегистрируйтесь")),
            telescopeCatalog = $("a[href='/katalog/teleskopy/']"),
            companyButton = $("a[href='/o-companii/']");


    public MainPage registrationButtonClick() {registrationButton.click(); return this;}

    public MainPage clickCatalog() {catalogButton.click(); return this;}

    public MainPage clickEntryButton() {entryButton.click(); return this;}

    public MainPage clickCatalogTelescopeButton() {telescopeCatalog.click(); return this;}

    public MainPage clickCompanyButton() {companyButton.click(); return this;}

}

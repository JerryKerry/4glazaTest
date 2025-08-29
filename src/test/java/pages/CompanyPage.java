package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.partialText;
import static com.codeborne.selenide.Selenide.$;

public class CompanyPage {

    private SelenideElement
            aboutTheStore = $("div[class='wysiwyg']");

    public CompanyPage checkStoreText() {
        aboutTheStore.shouldHave(partialText("www.4glaza.ru — интернет-магазин, входящий в состав " +
                "ПАО «Левенгук»."));

        return this;
    }
}

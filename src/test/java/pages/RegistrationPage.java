package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {

    private SelenideElement
            firstLastName = $("input[placeholder='Имя и фамилия']"),
            inputEmail = $("input[placeholder='E-mail']"),
            inputPhone = $("input[placeholder='Телефон']"),
            inputPassword = $("input[placeholder='Пароль']"),
            inputPasswordAgain = $("#confirm_password"),
            RegistrationButton = $(byText("Нет аккаунта? Зарегистрируйтесь"));

    public RegistrationPage setFirstLastName(String fullName) {
        firstLastName.click();
        firstLastName.sendKeys(fullName);

        return this;
    }

    public RegistrationPage setEmailName(String email) {
        inputEmail.click();
        inputEmail.sendKeys(email);

        return this;
    }
    public RegistrationPage setPhone(String phone) {
        inputPhone.click();
        inputPhone.sendKeys(phone);

        return this;
    }
    public RegistrationPage setPassword(String password) {
        inputPassword.click();
        inputPassword.sendKeys(password);

        return this;
    }

    public RegistrationPage setPasswordAgain(String password) {
        inputPasswordAgain.click();
        inputPasswordAgain.sendKeys(password);

        return this;
    }
}


package pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPage {

    private SelenideElement
            firstLastName = $("input[placeholder='Имя и фамилия']"),
            inputEmail = $("input[placeholder='E-mail']"),
            inputPhone = $("input[data-field='Телефон']"),
            inputPassword = $("input[data-field='Пароль']"),
            inputPasswordAgain = $("#confirm_password"),
            processingOfPersonalData = $("input[class='custom-control-input']"),
            registrationNowButton = $("input[value='Зарегистрироваться сейчас']"),
            alertSuccess = $("div[class ='alert alert-success']");

    public RegistrationPage openPage() {
        open("auth/registration/");

        return this;
    }


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

        System.out.println(password);


        return this;
    }

    public RegistrationPage clickProcessingOfPersonalData() {
        processingOfPersonalData.scrollIntoView("{block: 'center', behavior: 'instant'}")  // Центрируем элемент

                .click(ClickOptions.usingJavaScript());

        return this;
    }

    public RegistrationPage clickRegistrationButton() {
        registrationNowButton.scrollTo().hover().click();

        return this;
    }

    public RegistrationPage visibleAlertSuccess() {
        alertSuccess.shouldHave(text("Вы успешно зарегистрировались. На ваш адрес электронной почты было отправлено " +
                "сообщение с подтверждением регистрации."));

        return this;
    }
}


package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {

    private SelenideElement
            firstLastName = $("input[placeholder='Имя и фамилия']"),
            inputEmail = $("input[placeholder='E-mail']"),
            inputPhone = $("input[data-field='Телефон']"),
            inputPassword = $("input[data-field='Пароль']"),
            inputPasswordAgain = $("#confirm_password"),
            processingOfPersonalData = $("input[wfd-id='id10']"),
            registrationNowButton =$("input[value='Зарегистрироваться сейчас']");


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

        System.out.println(password);

        return this;
    }

    public RegistrationPage setPasswordAgain(String password) {
        inputPasswordAgain.click();
        inputPasswordAgain.sendKeys(password);

        System.out.println(password);


        return this;
    }

    public RegistrationPage clickProcessingOfPersonalData() {
        processingOfPersonalData.scrollTo().click();
        processingOfPersonalData.should(Condition.visible);

        return this;
    }

    public RegistrationPage clickRegistrationButton() {
        registrationNowButton.click();

        return this;
    }
}


package PageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.XPATH, using = "//label[text()='Email']/../input")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = "//label[text()='Пароль']/../input")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Войти')]")
    private SelenideElement buttonEnter; //кнопка Войти
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    private SelenideElement personalButton; //кнопка Личный кабинет
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Зарегистрироваться')]")
    private SelenideElement signUp; //кнопка Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
    private SelenideElement restorePassword; //кнопка Восстановить пароль

    @Step("Вводим email")
    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    @Step("Вводим пароль")
    public void enterPassword(String password) {
        passwordField.setValue(password);
    }

    @Step("Нажимаем на кнопку Войти")
    public void clickButtonEnter() {
        buttonEnter.click();
    }

    @Step("Mетод ввода email и пароля")
    public void sendPersonalData(String email, String password) {
        enterEmail(email);
        enterPassword(password);
    }

    @Step("Нажимаем на кнопку Регистрация")
    public void clickSignUpLoginPage() {
        signUp.click();
    }

    @Step("Нажимаем на кнопку Восстановить пароль")
    public void clickRecoveryBtn() {
        restorePassword.click();
    }
}

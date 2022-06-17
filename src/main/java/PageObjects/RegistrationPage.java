package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
    @FindBy(how = How.XPATH, using = "//label[text()='Имя']/../input")
    private SelenideElement nameField; // поле имя
    @FindBy(how = How.XPATH, using = "//label[text()='Email']/../input")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = "//label[text()='Пароль']/../input")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement signUp; //кнопка Войти
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Зарегистрироваться')]")
    private SelenideElement enter; // поле Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Некорректный пароль')]")
    private SelenideElement errorMessage; //ошибка при некорректном пароле

    @Step("Нажимаем на кнопку Войти")
    public void clickBtnSignUp() {
        signUp.click();
    }

    @Step("Вводи Имя")//вводи Имя
    public void enterName(String name) {
        nameField.setValue(name);
    }

    @Step("Вводи email")
    public void enterEmail(String email) {
        emailField.setValue(email);
    }

    @Step("Вводи пароль")
    public void enterPassword(String password) {
        passwordField.setValue(password);
    }

    @Step("Нажимаем на кнопку Войти")
    public void clickButtonEnter() {
        signUp.click();
    }

    @Step("Метод ввода имени, email и корректного пароля")
    public void sendPersonalData(String name, String email, String password) {
        enterName(name);
        enterEmail(email);
        enterPassword(password);
    }

    @Step("Метод ввода имени, email и некорректного пароля")
    public void sendPersonalDataIncorrectPassword(String name1, String email1, String password1) {
        enterName(name1);
        enterEmail(email1);
        enterPassword(password1);
    }

    @Step("Проверка видимости ошибки")
    public void visibleErrorText() {
        errorMessage.shouldBe(Condition.visible);
    }

}

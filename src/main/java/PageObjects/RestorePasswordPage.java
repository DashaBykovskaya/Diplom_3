package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RestorePasswordPage {
    @FindBy(how = How.XPATH, using = ".//div[text()='Имя']")
    private SelenideElement nameField; // поле имя
    @FindBy(how = How.XPATH, using = ".//div[text()='Email']")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = ".//div[text()='Пароль']")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.CLASS_NAME, using = "input__container")
    private SelenideElement signUp; //кнопка Зарегистрироваться
    @FindBy(how = How.XPATH, using = ".//div[text()='Войти']")
    private SelenideElement enter; // поле Войти

}

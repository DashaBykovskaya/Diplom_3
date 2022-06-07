package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
    /*@FindBy(how = How.XPATH, using = ".//div[text()='Имя']")
    private SelenideElement nameField; // поле имя
    @FindBy(how = How.XPATH, using = ".//div[text()='Email']")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = ".//div[text()='Пароль']")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.CLASS_NAME, using = "input__container")
    private SelenideElement signUp; //кнопка Зарегистрироваться*/
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement enter; // поле Войти

    //нажимаем на кнопку Войти
    public void clickBtnSignUp(){
        enter.click();
    }

}

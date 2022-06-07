package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site";
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
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement restorePassword; //кнопка Восстановить пароль
    @FindBy(how = How.XPATH, using = ".//div[text()='Восстановить пароль']")
    private SelenideElement constructorButton; // кнопка Конструктор
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logoBugers; //логотип Бургер*/

    //вводим email
    public void enterEmail(String email){
        emailField.setValue(email);
    }
    //вводим пароль
    public void enterPassword(String password){
        passwordField.setValue(password);
    }
    //нажимаем на кнопку Войти
    public void clickButtonEnter(){
        buttonEnter.click();
    }
    //метод ввода email и пароля
    public void sendPersonalData(String email, String password){
        enterEmail(email);
        enterPassword(password);
    }
    //нажимаем на кнопку Регистрация
    public void clickSignUpLoginPage(){
        signUp.click();
    }

}

package PageObjects;

import com.codeborne.selenide.SelenideElement;
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
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__link__3D_hX")
    private SelenideElement constructor; //кнопка открытие конструктора
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logo; //логотип сайта
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
    //нажимаем на кнопку Восстановить пароль
    public void clickRecoveryBtn(){
        restorePassword.click();
    }
    //открываем конструктор
    public void clickOpenConstructor(){
        constructor.click();
    }
    //нажимаем на логотип сайта
    public void clickLogo(){
        logo.click();
    }

}

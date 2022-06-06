package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site/";
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__link__3D_hX")
    private SelenideElement personal; // кнопка "Личный кабинет"
    @FindBy(how = How.XPATH, using = ".//div[text()='Email']")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = ".//div[text()='Пароль']")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.CLASS_NAME, using = "button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa")
    private SelenideElement buttonEnter; //кнопка Войти
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement signUp; //кнопка Зарегистрироваться
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement restorePassword; //кнопка Восстановить пароль
    @FindBy(how = How.XPATH, using = ".//div[text()='Пароль']")
    private SelenideElement constructorButton; // кнопка Конструктор
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logoBugers; //логотип Бургер
}

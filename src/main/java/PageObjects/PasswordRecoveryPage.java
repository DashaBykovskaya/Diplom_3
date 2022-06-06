package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PasswordRecoveryPage {
    @FindBy(how = How.XPATH, using = ".//div[text()='Email']")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.CLASS_NAME, using = "button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa")
    private SelenideElement reestablish; //кнопка Восстановить
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement enter; //кнопка Войти
}

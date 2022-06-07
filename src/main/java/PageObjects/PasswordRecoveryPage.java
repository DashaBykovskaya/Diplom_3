package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PasswordRecoveryPage {
    @FindBy(how = How.CLASS_NAME, using = "Auth_link__1fOlj")
    private SelenideElement enter; //кнопка Войти
    //нажимаем на кнопку Войти
    public void clickEnter(){
        enter.click();
    }
}

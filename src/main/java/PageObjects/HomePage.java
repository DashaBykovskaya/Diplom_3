package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site/";
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Войти в аккаунт')]")
    private SelenideElement buttonEnterFromMainPage; //кнопка Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    private SelenideElement personalButton; //кнопка Личный кабинет
    //@FindBy(how = How.XPATH, using = ".//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    //private SelenideElement signIn; //кнопка Войти в аккаунт

    //нажимаем на кнопку Войти в аккаунт
    public void signInTest(){
        buttonEnterFromMainPage.click();
    }
    //нажимаем на кнопку Личный кабинет
    public void clickPersonal(){
        personalButton.click();
    }
}

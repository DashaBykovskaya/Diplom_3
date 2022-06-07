package PageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site/";
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Войти в аккаунт')]")
    private SelenideElement buttonEnterFromMainPage; //кнопка Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    private SelenideElement personalButton; //кнопка Личный кабинет

    //нажимаем на кнопку Войти в аккаунт
    public void signInTest(){
        buttonEnterFromMainPage.click();
    }
    //нажимаем на кнопку Личный кабинет
    public void clickPersonal(){
        personalButton.click();
    }
    //открытие страницы https://stellarburgers.nomoreparties.site
    public void openHomePage(){
        //Selenide.open("https://stellarburgers.nomoreparties.site/");

    }
}

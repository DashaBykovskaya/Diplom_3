package PageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalPage {
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Выход')]")
    private SelenideElement logOut; //кнопка Выход
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__link__3D_hX")
    private SelenideElement constructor; //кнопка открытие конструктора
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logo; //логотип сайта

    @Step("Нажимаем на кнопку Выход")
    public void clickLogOut() {
        logOut.click();
    }

    @Step("Открываем конструктор")
    public void clickOpenConstructor() {
        constructor.click();
    }

    @Step("Нажимаем на логотип сайта")
    public void clickLogo() {
        logo.click();
    }
}

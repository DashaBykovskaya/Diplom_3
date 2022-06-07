package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalAcc {
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Выход')]")
    private SelenideElement logOut; //кнопка Выход
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__link__3D_hX")
    private SelenideElement constructor; //кнопка открытие конструктора
    @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
    private SelenideElement logo; //логотип сайта
    //нажимаем на кнопку Выход
    public void clickLogOut(){
        logOut.click();
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

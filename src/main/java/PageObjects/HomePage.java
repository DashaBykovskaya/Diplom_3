package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site/";
    public Object shouldBe;
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Мясо бессмертных моллюсков Protostomia')]")
    public SelenideElement toppingFirst;
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Соус Spicy-X')]")
    public SelenideElement saucesFirst;
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Флюоресцентная булка R2-D3')]")
    public SelenideElement bunsFirst;
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Войти в аккаунт')]")
    private SelenideElement buttonEnterFromMainPage; //кнопка Войти в аккаунт
    @FindBy(how = How.XPATH, using = "//*[text()='Личный Кабинет']")
    private SelenideElement personalButton; //кнопка Личный кабинет
    @FindBy(how = How.XPATH, using = "//*[text()='Булки']")
    private SelenideElement buns; //вкладка Булки
    @FindBy(how = How.XPATH, using = "//*[text()='Соусы']")
    private SelenideElement sauces; //вкладка Соусы
    @FindBy(how = How.XPATH, using = "//*[text()='Начинки']")
    private SelenideElement fillings; //вкладка Начинки

    @Step("Нажимаем на кнопку Войти в аккаунт")
    public void clickSignIn() {
        buttonEnterFromMainPage.click();
    }

    @Step("Нажимаем на кнопку Личный кабинет")
    public void clickPersonal() {
        personalButton.click();
    }

    @Step("Нажимаем на вкладку Соусы")
    public void clickSauces() {
        sauces.click();
    }

    @Step("Нажимаем на вкладку Начинки")
    public void clickFillings() {
        fillings.click();
    }

    @Step("Нажимаем на вкладку Булки")
    public void clickBuns() {
        buns.click();
    }

    @Step("Проверка перехода на вкладку Соусы")
    public void goToTabSauces() {
        sauces.shouldBe(Condition.visible);
    }

    @Step("Проверка перехода на вкладку Начинки")
    public void goToTabFillings() {
        fillings.shouldBe(Condition.visible);
    }

    @Step("Проверка перехода на вкладку Булки")
    public void goToTabBuns() {
        buns.shouldBe(Condition.visible);
    }

    @Step("Закрываем браузер")
    public void close() {
        Selenide.webdriver().driver().close();
    }
}

package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HomePage {
    public static final String pageURL = "https://stellarburgers.nomoreparties.site/";
    public Object shouldBe;
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
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Мясо бессмертных моллюсков Protostomia')]")
    public SelenideElement toppingFirst;
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Соус Spicy-X')]")
    public SelenideElement saucesFirst;
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Флюоресцентная булка R2-D3')]")
    public SelenideElement bunsFirst;


    //нажимаем на кнопку Войти в аккаунт
    public void signInTest(){
        buttonEnterFromMainPage.click();
    }
    //нажимаем на кнопку Личный кабинет
    public void clickPersonal(){
        personalButton.click();
    }
    //нажимаем на вкладку Соусы
    public void clickSauces(){
        sauces.click();
    }
    //нажимаем на вкладку Начинки
    public void clickFillings(){
        fillings.click();
    }
    //нажимаем на вкладку Булки
    public void clickBuns(){
        buns.click();
    }
    //проверка перехода на вкладку Соусы
    public void openSauces(){
        sauces.shouldBe(Condition.visible);
    }
    //проверка перехода на вкладку Начинки
    public void openFillings(){
        sauces.shouldBe(Condition.visible);
    }
    //проверка перехода на вкладку Булки
    public void openBuns(){
        buns.shouldBe(Condition.visible);
    }
}

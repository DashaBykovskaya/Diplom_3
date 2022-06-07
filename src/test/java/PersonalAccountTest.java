import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PersonalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class PersonalAccountTest {

    String email = "123@456.ru";
    String password = "Qwerty";
    HomePage homePage = open(HomePage.pageURL, HomePage.class);
    LoginPage loginPage = page(LoginPage.class);
    PersonalPage personalAcc = page(PersonalPage.class);

    @Before
    public void setUp() {
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
        homePage.clickPersonal();
    }
    @After
    public void exit(){
        homePage.clickPersonal();
        personalAcc.clickLogOut();
    }
    @Test
    //Проверка переход по клику на «Конструктор»
    public void openConstructorTest(){
        personalAcc.clickOpenConstructor();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/"));
    }
    @Test
    //Проверка перехода по логотипу
    public void clickLogoTest(){
        personalAcc.clickLogo();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/"));
    }
}

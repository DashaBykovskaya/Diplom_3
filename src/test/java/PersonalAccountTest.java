import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PersonalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

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
        homePage.openHomePage();
    }
    @Test
    //Проверка переход по клику на «Конструктор»
    public void openConstructorTest(){
        personalAcc.clickOpenConstructor();
        homePage.openHomePage();
    }
    @Test
    //Проверка перехода по логотипу
    public void clickLogoTest(){
        personalAcc.clickLogo();
        homePage.openHomePage();
    }
}

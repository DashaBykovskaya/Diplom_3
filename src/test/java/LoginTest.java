import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginTest {
    String email = "123@456.ru";
    String password = "Qwerty";
    LoginPage loginPage = page(LoginPage.class);
    //HomePage homePage;

    @Test
    //вход через кнопку Личный кабинет
    public void loginSystemPersonalTest(){
        //LoginPage loginPage = open(LoginPage.pageURL, LoginPage.class);
        HomePage homePage = open(HomePage.pageURL, HomePage.class);
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }

    @Test
    //вход через кнопку Войти в аккаунт
    public void loginSystemMaiPageTest(){
        HomePage homePage = open(HomePage.pageURL, HomePage.class);
        homePage.signInTest();
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }
}

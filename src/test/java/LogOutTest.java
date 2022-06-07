import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PersonalAcc;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LogOutTest {
    String email = "123@456.ru";
    String password = "Qwerty";
    HomePage homePage = open(HomePage.pageURL, HomePage.class);
    LoginPage loginPage = page(LoginPage.class);
    PersonalAcc personalAcc = page(PersonalAcc.class);

    @Before
    public void setUp() {
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
        homePage.clickPersonal();
    }
    @Test
    //проверка выхода из личного кабинет
    public void logoutTest(){
        personalAcc.clickLogOut();
    }
}

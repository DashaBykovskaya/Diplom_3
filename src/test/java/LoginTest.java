import PageObjects.LoginPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    String email = "123@456.ru";
    String password = "Qwerty";

    @Test
    public void loginSystemTest(){
        LoginPage loginPage = open(LoginPage.pageURL, LoginPage.class);
        //loginPage.clickPersonalAccount();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }
}

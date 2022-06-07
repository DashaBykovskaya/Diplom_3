import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PasswordRecoveryPage;
import PageObjects.RegistrationPage;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationTest {
    String name = "Test";
    String email = "1218@456.ru";
    String password = "Qwerty";
    String name1 = "Test1";
    String email1 = "1070@45611.ru";
    String password1 = "Qwe";
    LoginPage loginPage = page(LoginPage.class);
    RegistrationPage registrationPage = page(RegistrationPage.class);
    HomePage homePage = open(HomePage.pageURL, HomePage.class);
    @After
    public void closePage(){
        homePage.close();
    }
    @Test
    //регистрация нового пользователя
    public void RegistrationPageTest(){
        homePage.clickPersonal();
        loginPage.clickSignUpLoginPage();
        registrationPage.sendPersonalData(name, email, password);
        registrationPage.clickButtonEnter();
    }
    @Test
    //регистрация при неверном пароле
    public void incorrectPasswordTest(){
        homePage.clickPersonal();
        loginPage.clickSignUpLoginPage();
        registrationPage.sendPersonalDataIncorrectPassword(name1, email1, password1);
        registrationPage.clickButtonEnter();
        registrationPage.visibleErrorText();
    }
}

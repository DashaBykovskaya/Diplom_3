import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PasswordRecoveryPage;
import PageObjects.RegistrationPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class LoginTest {
    String email = "123@456.ru";
    String password = "Qwerty";
    LoginPage loginPage = page(LoginPage.class);
    RegistrationPage registrationPage = page(RegistrationPage.class);
    PasswordRecoveryPage passwordRecoveryPage = page(PasswordRecoveryPage.class);
    HomePage homePage = open(HomePage.pageURL, HomePage.class);

    @Test
    //вход через кнопку Личный кабинет
    public void loginSystemPersonalTest(){
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }

    @Test
    //вход через кнопку Войти в аккаунт
    public void loginSystemMaiPageTest(){
        homePage.signInTest();
        homePage.clickPersonal();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }
    @Test
    //вход через кнопку Зарегистрироваться
    public void loginSystemSignUpTest(){
        homePage.signInTest();
        loginPage.clickSignUpLoginPage();
        registrationPage.clickBtnSignUp();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }
    @Test
    //вход через кнопку Восстановления пароля
    public void loginSystemRecoveryPageTest(){
        homePage.signInTest();
        loginPage.clickRecoveryBtn();
        passwordRecoveryPage.clickEnter();
        loginPage.sendPersonalData(email, password);
        loginPage.clickButtonEnter();
    }
}

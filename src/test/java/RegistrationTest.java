import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class RegistrationTest {
    String name = "Test";
    String email = "1218@456.ru";
    String password = "Qwerty";
    String incorrectPassword = "Qwe";
    LoginPage loginPage = page(LoginPage.class);
    RegistrationPage registrationPage = page(RegistrationPage.class);
    HomePage homePage = open(HomePage.pageURL, HomePage.class);

    @After
    public void closePage() {
        homePage.close();
    }

    @Test
    @DisplayName("Регистрация нового пользователя")
    public void RegistrationPageTest() {
        homePage.clickPersonal();
        loginPage.clickSignUpLoginPage();
        registrationPage.sendPersonalData(name, email, password);
        registrationPage.clickButtonEnter();
    }

    @Test
    @DisplayName("Регистрация нового пользователя при вводе некорректного пароля")
    public void incorrectPasswordTest() {
        homePage.clickPersonal();
        loginPage.clickSignUpLoginPage();
        registrationPage.sendPersonalDataIncorrectPassword(name, email, incorrectPassword);
        registrationPage.clickButtonEnter();
        registrationPage.visibleErrorText();
    }
}

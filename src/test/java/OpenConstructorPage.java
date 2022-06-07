import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class OpenConstructorPage {
    LoginPage loginPage = page(LoginPage.class);
    HomePage homePage = open(HomePage.pageURL, HomePage.class);

    @Test
    //Проверка переход по клику на «Конструктор»
    public void openConstructorTest(){
        homePage.clickPersonal();
        loginPage.clickOpenConstructor();
        homePage.openHomePage();
    }

    @Test
    //Проверка перехода на логотип
    public void clickLogoTest(){
        homePage.clickPersonal();
        loginPage.clickLogo();
        homePage.openHomePage();
    }
}

import PageObjects.HomePage;
import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {
    HomePage homePage = open(HomePage.pageURL, HomePage.class);

    @After
    public void closePage() {
        homePage.close();
    }

    @Test
    @DisplayName("Проверка перехода на вкладку Соусы")
    public void openSauces() {
        homePage.clickSauces();
        homePage.openSauces();
    }

    @Test
    @DisplayName("Проверка перехода на вкладку Начинки")
    public void openFillings() {
        homePage.clickFillings();
        homePage.openFillings();
    }

    @Test
    @DisplayName("Проверка перехода на вкладку Булки")
    public void openBuns() {
        homePage.clickFillings();
        homePage.clickBuns();
        homePage.openBuns();
    }
}

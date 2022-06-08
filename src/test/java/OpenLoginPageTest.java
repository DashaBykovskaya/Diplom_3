import PageObjects.HomePage;
import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.After;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenLoginPageTest {
    HomePage homePage = open(HomePage.pageURL, HomePage.class);

    @After
    public void closePage() {
        homePage.close();
    }

    @Test
    @DisplayName("Проверка перехода по клику на «Личный кабинет»")
    public void openLoginPageTest() {
        homePage.clickPersonal();
    }
}

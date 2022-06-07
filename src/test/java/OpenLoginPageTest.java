import PageObjects.HomePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class OpenLoginPageTest {
    HomePage homePage = open(HomePage.pageURL, HomePage.class);
    @Test
    //Проверь переход по клику на «Личный кабинет»
    public void openLoginPageTest(){
        homePage.clickPersonal();
    }
}

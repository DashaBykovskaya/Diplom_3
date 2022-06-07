import PageObjects.HomePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorTest {
    HomePage homePage = open(HomePage.pageURL, HomePage.class);
    @Test
    //проверка перехода на вкладку Соусы
    public void openSauces(){
        homePage.clickSauces();
        homePage.openSauces();
    }
    @Test
    //проверка перехода на вкладку Начинки
    public void openFillings(){
        homePage.clickFillings();
        homePage.openFillings();
    }
    @Test
    //проверка перехода на вкладку Булки
    public void openBuns(){
        homePage.clickFillings();
        homePage.clickBuns();
        homePage.openBuns();
    }
}

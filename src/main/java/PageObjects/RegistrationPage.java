package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
    @FindBy(how = How.XPATH, using = "//label[text()='Имя']/../input")
    private SelenideElement nameField; // поле имя
    @FindBy(how = How.XPATH, using = "//label[text()='Email']/../input")
    private SelenideElement emailField; // поле Email
    @FindBy(how = How.XPATH, using = "//label[text()='Пароль']/../input")
    private SelenideElement passwordField; // поле Пароль
    @FindBy(how = How.CLASS_NAME, using = "input__container")
    private SelenideElement signUp; //кнопка Зарегистрироваться*/
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Зарегистрироваться')]")
    private SelenideElement enter; // поле Войти
    @FindBy(how = How.XPATH, using = ".//p[contains(text(),'Некорректный пароль')]")
    private SelenideElement errorMessage; //ошибка при некорректном пароле

    //нажимаем на кнопку Войти
    public void clickBtnSignUp(){
        enter.click();
    }
    //вводи Имя
    public void enterName(String name){
        nameField.setValue(name);
    }
    //вводим email
    public void enterEmail(String email){
        emailField.setValue(email);
    }
    //вводим пароль
    public void enterPassword(String password){
        passwordField.setValue(password);
    }
    //нажимаем на кнопку Войти
    public void clickButtonEnter(){
        signUp.click();
    }
    //метод ввода email и пароля
    public void sendPersonalData(String name, String email, String password){
        enterName(name);
        enterEmail(email);
        enterPassword(password);
    }
    public void sendPersonalDataIncorrectPassword(String name1, String email1, String password1){
        enterName(name1);
        enterEmail(email1);
        enterPassword(password1);
    }
    //проверка видимости ошибки
    public void visibleErrorText(){
        errorMessage.shouldBe(Condition.visible);
    }

}

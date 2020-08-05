package YandexMusic;

import Page.BasePage;
import org.openqa.selenium.By;

public class YandexAuthorizationPage extends BasePage {
    protected static By UserNameField = By.xpath("//input[@id='passp-field-login']");
    protected static By PasswordField = By.xpath("//input[@id='passp-field-passwd']");

    public static void userNameEnter(String text) {
        newPage();
        sendKeys(UserNameField, text);
        enter(UserNameField);

    }

    public static void passwordEnter(String text) {
        sendKeys(PasswordField, text);
        enter(PasswordField);
    }


}

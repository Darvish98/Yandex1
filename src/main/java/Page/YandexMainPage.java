package Page;

import org.openqa.selenium.By;

import static Page.BasePage.*;

public class YandexMainPage {
    private static String pageURL = "https://music.yandex.by/home";

    private static By Button = By.xpath("//span[@class='button__label']");
    private static By MainProfile = By.xpath("//div[contains(@class,'user__userpic user__userpic_size_L')]");

    private static By ComparisonText = By.xpath("//div[@class='multi-auth__user-name typo']");

    public static void clickProfile() {
        newPage();
        clickJS(MainProfile);

    }


    public static void start() {
        open(pageURL);

    }


    public static void clickButton() {
        click(Button);
    }

    public static void comparisonText(String text){
        comparison(ComparisonText, text);
    }


}


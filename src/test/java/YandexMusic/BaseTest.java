package YandexMusic;

import org.testng.annotations.AfterMethod;

public class BaseTest {
    @AfterMethod
    public void end() {

        // DriverSingleton.closeDriver();
    }
}

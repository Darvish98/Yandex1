package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static EventFiringWebDriver driver;


    private DriverSingleton() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                DriverSingleton.start();
            } catch (Exception E) {
                System.out.println("Driver wasn't set");
            }
        }
        return driver;
    }

    public static void start() {
        WebDriverManager.chromedriver().setup();
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new WebDriverListener());
        setUpDriver();

    }

    public static void setUpDriver() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

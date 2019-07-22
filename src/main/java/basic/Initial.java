package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Initial {

    private static WebDriver driver;
    private static Properties properties = TestProperties.getInstance().getProperties();

    public static void startBrowser() {
        if ("firefox".equals(properties.getProperty("browser"))) {
            System.setProperty("webdriver.firefox.driver", properties.getProperty("webdriver.firefox.driver"));
            FirefoxOptions option = new FirefoxOptions();
            driver = new FirefoxDriver(option);
        } else {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            ChromeOptions option = new ChromeOptions();
            option.setExperimentalOption("useAutomationExtension", false);
            driver = new ChromeDriver(option);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Driver {
    //create a driver instance
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    private Driver() {
    }

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browserParamFromEnv = ConfigurationReader.getProperty("browser");
            String browser = browserParamFromEnv == null ? ConfigurationReader.getProperty("browser") : browserParamFromEnv;
            WebDriverManager.chromedriver().clearDriverCache().setup();
            driverPool.set(new ChromeDriver());
        }
        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driverPool.get().manage().window().maximize();
        return driverPool.get();
    }

    public static void closeDriver() {
        driverPool.get().quit();
        driverPool.remove();
    }





}

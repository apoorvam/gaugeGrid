package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    // Get a new WebDriver Instance.
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        String browser = System.getenv("BROWSER");
        if (browser == null)  {
            capabilities.setBrowserName("firefox");
        }

        capabilities.setBrowserName(browser);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
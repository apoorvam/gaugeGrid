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
            capabilities.setBrowserName("firefox"); //default
        }

        capabilities.setBrowserName(browser);
        capabilities.setCapability("takesScreenshot", "true");
        RemoteWebDriver driver = null;
        try {
            String selenium_hub_ip = System.getenv("SELENIUM_HUB_IP");
            driver = new RemoteWebDriver(new URL(selenium_hub_ip), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
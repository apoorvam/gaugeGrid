package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        String browser = System.getenv("BROWSER");
        if (browser == null)  {
            capabilities.setBrowserName("firefox");
        }

        capabilities.setBrowserName(browser);
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://10.4.21.225:4444/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

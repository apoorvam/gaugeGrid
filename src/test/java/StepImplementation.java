import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class StepImplementation {

    @Step("Navigate to <url>")
    public void navigateTo(String url) {
        Driver.webDriver.get(url);
        assertTrue(Driver.webDriver.getTitle().contains("Gauge"));
    }

    @Step("Go to Gauge Get Started Page")
    public void gotoGetStartedPage() throws Exception {
        WebElement getStartedButton = Driver.webDriver.findElement(By.xpath("/html/body/header/div/nav/ul/li[1]/a"));

        getStartedButton.click();
        Gauge.writeMessage("Page title is ", Driver.webDriver.getTitle());
    }
}

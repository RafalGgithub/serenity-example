package gateway.helper;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBase {
    private WebDriver driver;

    @Before
    public void runDriver()
    {
        if (null == driver) {
            driver = new FirefoxDriver();
        }
    }

    public WebDriver getDriver()
    {
        return driver;
    }

}

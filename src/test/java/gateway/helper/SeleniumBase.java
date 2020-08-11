package gateway.helper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBase {
    private WebDriver driver;

    @Before
    public void before()
    {
        if (null == driver) {
            driver = new FirefoxDriver();
        }
    }

    @After
    public void after() {
        if (null != driver) {
            driver.close();
            //driver.quit();
        }
    }

    public WebDriver getDriver()
    {
        return driver;
    }

}

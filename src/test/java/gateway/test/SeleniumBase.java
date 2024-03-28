package gateway.test;

import org.junit.After;
import org.junit.Before;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty,timeline:build/test-results/timeline")
public class SeleniumBase {
    private WebDriver driver;

    @Before
    public void before()
    {
        if (null == driver) {
            driver = new ChromeDriver();
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

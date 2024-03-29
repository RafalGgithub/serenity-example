package rockwell.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForMethods {


    public static final Duration TIMEOUT = Duration.ofSeconds(10);
    private final WebDriver driver;

    public WaitForMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void visibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void staleness(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public void staleness(WebElement element, int timeoutmilis) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(timeoutmilis));
        wait.until(ExpectedConditions.stalenessOf(element));
    }
}

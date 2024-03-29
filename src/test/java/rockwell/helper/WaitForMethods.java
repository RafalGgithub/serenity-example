package rockwell.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void textToBePresent(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,text));
    }
}

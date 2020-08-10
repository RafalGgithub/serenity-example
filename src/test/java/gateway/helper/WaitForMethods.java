package gateway.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitForMethods extends SeleniumBase {

    public void clickable(By locator, long timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void visibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    /*
    TODO rest of needed waits
     */
}

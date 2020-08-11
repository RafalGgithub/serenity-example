package gateway.test;

import gateway.steps.SerenityGatewaySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
@Narrative(text={"Testing sms gateway"})
public class SerenityGatewayTests {

    @Managed
    WebDriver driver;

    @Steps
    SerenityGatewaySteps gateway;

    @Test
    public void sendTextMessage() {
    gateway.open();
    gateway.clickSomeButton();
    gateway.typeMessage();
    gateway.clickSendButton();
    gateway.verifyCaptchaIsDisplayed();
    }
}

package gateway.test;

import gateway.steps.SerenityGatewaySteps;
import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
@Narrative(text={"Testing sms gateway"})
public class SerenityGatewayTests {

    @Steps
    SerenityGatewaySteps gateway = new SerenityGatewaySteps();

    @Test
    public void sendTextMessage() {
    gateway.open();
    gateway.clickCookiesAcceptButton();
    gateway.typeMessage();
    gateway.clickSendButton();
    gateway.verifyCaptchaIsDisplayed();
    }
}

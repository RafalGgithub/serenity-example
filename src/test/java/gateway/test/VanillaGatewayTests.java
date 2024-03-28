package gateway.test;

import gateway.pages.VanillaGatewayPage;
import org.junit.Test;


public class VanillaGatewayTests extends SeleniumBase {

    @Test
    public void sendTextMessage() {

        VanillaGatewayPage gateway = new VanillaGatewayPage(getDriver());
        gateway.open().clickCookiesAcceptButton().clickSendButton();
        //etc
    }
}

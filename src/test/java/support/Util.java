package support;

import definitions.Hooks;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends Hooks {
    public static WebDriverWait wait;
    public static TouchAction move;

    public Util() {

        wait = new WebDriverWait(driver,30);
        move = new TouchAction(driver);
    }




}

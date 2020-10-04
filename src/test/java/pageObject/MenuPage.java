package pageObject;


import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import support.Util;

public class MenuPage extends Util {
    String scroll = "";

    public MenuPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectMenu(String opcionMenu) {
        scroll = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + opcionMenu + "\"))";
    }

    public void tapMenu(){
        driver.findElement(MobileBy.AndroidUIAutomator(scroll)).click();
    }
}

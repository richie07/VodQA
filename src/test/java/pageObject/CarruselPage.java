package pageObject;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class CarruselPage extends Util {
    @AndroidFindBy(xpath = "//*[@text='1']") private AndroidElement lblNumero;


    public CarruselPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void validatePrimerCarrusel(String number){
        wait.until(ExpectedConditions.visibilityOf(lblNumero));
        Assert.assertEquals(number,lblNumero.getText());
    }
}

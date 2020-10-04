package pageObject;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Util;

public class LoginPage extends Util {

    @AndroidFindBy(accessibility = "username") private AndroidElement txtadmin;
    @AndroidFindBy(accessibility = "password") private AndroidElement txtpassword;
    @AndroidFindBy(xpath = "//*[@text='LOG IN']") private AndroidElement btnLogin;
    @AndroidFindBy(xpath = "//*[@text='Samples List']") private AndroidElement lblTitle;


    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void typeUser(String username){
        wait.until(ExpectedConditions.visibilityOf(txtadmin));
        txtadmin.clear();
        txtadmin.sendKeys(username);
    }

    public void typePassword(String password){
        txtpassword.clear();
        txtpassword.sendKeys(password);
    }

    public void tapLogIn(){
        btnLogin.click();
    }

    public void validateSuccesfull(){
        wait.until(ExpectedConditions.visibilityOf(lblTitle));
        Assert.assertEquals("Samples List",lblTitle.getText());
    }
}

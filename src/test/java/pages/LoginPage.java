package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (partialLinkText ="Kayıt Ol" )
    public WebElement LoginKayitOlButton;

    @FindBy(xpath ="//input[@type='email']" )
    public WebElement emailTextBox;

    @FindBy(xpath ="//input[@type='password']" )
    public WebElement passwordTextBox;

    @FindBy(xpath ="//button[text()='Login']" )
    public WebElement loginButton;


}

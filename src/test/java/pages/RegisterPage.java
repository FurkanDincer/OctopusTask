package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@type='text']" )
    public WebElement isimSoyisimTextBox;

    @FindBy(xpath ="//input[@type='email']" )
    public WebElement emailTextBox;

    @FindBy(xpath ="(//input[@type='password'])[1]" )
    public WebElement passwordTextBox;

    @FindBy(xpath ="(//input[@type='password'])[2]" )
    public WebElement passwordTekrarTextBox;

    @FindBy(xpath ="//button[@type='submit']" )
    public WebElement kayitOlButton;
    @FindBy(xpath ="(//span[@class='icon'])[1]" )
    public WebElement mailIcon;



}

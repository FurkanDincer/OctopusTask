package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();


    @When("Kullanici Kayitli Email Adresini Girer")
    public void kullanici_kayitli_email_adresini_girer() {
        loginPage.emailTextBox.sendKeys(ConfigReader.getProperty("user_email"));
    }
    @When("Kullanici Sifre Girer")
    public void kullanici_sifre_girer() {
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("user_password"));
    }
    @When("Kullanici Login Butonuna Tiklar")
    public void kullanici_login_butonuna_tiklar() {

        ReusableMethods.clickWithJS(loginPage.loginButton);
        ReusableMethods.waitFor(1);
    }
    @When("Kullanici Anasayfada Oldugunu Dogrular")
    public void kullanici_anasayfada_oldugunu_dogrular() {
        Assert.assertTrue(dashBoardPage.octopusLogo.isDisplayed());
    }
}

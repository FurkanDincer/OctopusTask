package stepdefinitions;

import io.cucumber.java.en.*;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class ContentStepDefinitions {
    DashBoardPage dashBoardPage=new DashBoardPage();
    @Given("Kullanici Login Olur ve Login oldugunu dogrular")
    public void kullanici_login_olur_ve_login_oldugunu_dogrular() {
        octopusLogin();
    }

    @When("Kullanici Icerikler alanina tiklar")
    public void kullanici_icerikler_alanina_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.iceriklerButton);
    }

    @When("Kullanici Icerik Yukle butonuna tiklar")
    public void kullanici_icerik_yukle_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.icerikYukleButton);
        ReusableMethods.waitFor(2);
    }

    @When("Kullanici Masaustunden bir icerik secer")
    public void kullaniciMasaustundenBirIcerikSecer() {

        dashBoardPage.uploadButton.sendKeys("C:\\Users\\Furkan\\Desktop\\Kapadokya.jpg");
        ReusableMethods.waitFor(2);
    }

    @When("Kullanici Icerik Yuklendi mesajini dogrular")
    public void kullaniciIcerikYuklendiMesajiniDogrular() {
    }

    public void octopusLogin() {
        LoginPage loginPage=new LoginPage();
        DashBoardPage dashBoardPage=new DashBoardPage();
        loginPage.emailTextBox.sendKeys(ConfigReader.getProperty("user_email"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("user_password"));
        ReusableMethods.clickWithJS(loginPage.loginButton);
        Assert.assertTrue(dashBoardPage.octopusLogo.isDisplayed());
    }
}
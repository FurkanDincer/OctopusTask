package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;

public class RegisterStepDefinitions {
    LoginPage loginPage=new LoginPage();
    RegisterPage registerPage=new RegisterPage();
    DashBoardPage dashBoardPage=new DashBoardPage();
    Faker faker=new Faker();

    public String fullName=faker.name().fullName();
    public String eMail=faker.internet().emailAddress();


//    Register Positive Steps
    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("Kullanici Kayit Ol butonuna tiklar")
    public void kullanici_kayit_ol_butonuna_tiklar() {
        loginPage.LoginKayitOlButton.click();
    }
    @When("Kullanici İsim Soyisim girer")
    public void kullanici_i̇sim_soyisim_girer() {
        registerPage.isimSoyisimTextBox.sendKeys(fullName);
    }
    @When("Kullanici Email girer")
    public void kullanici_email_girer() {
        registerPage.emailTextBox.sendKeys(eMail);
    }
    @When("Kullanici Sifre girer")
    public void kullanici_sifre_girer() {
        registerPage.passwordTextBox.sendKeys("123");
    }
    @When("Kullanici Sifre Tekrar girer")
    public void kullanici_sifre_tekrar_girer() {
        registerPage.passwordTekrarTextBox.sendKeys("123");
    }
    @Then("Kullanici Kayit Oldugunu dogrular")
    public void kullanici_kayit_oldugunu_dogrular() {
        Assert.assertTrue(dashBoardPage.octopusLogo.isDisplayed());
    }

    @When("Kullanici Register Kayit Ol butonuna tiklar")
    public void kullaniciRegisterKayitOlButonunaTiklar() {
        registerPage.kayitOlButton.click();
    }


//    Register Negative Steps
    @When("Kullanici Isim Soyisim alanini bos birakir")
    public void kullaniciIsimSoyisimAlaniniBosBirakir() {
    }

    @When("Kullanici Email alanini bos birakir")
    public void kullaniciEmailAlaniniBosBirakir() {
    }
    @When("Kullanici Sifre Alanlarini Bos Birakir")
    public void kullaniciSifreAlanlariniBosBirakir() {
    }
    @When("Kullanici @ simgesi kullanmadan Email girer")
    public void kullaniciSimgesiKullanmadanEmailGirer() {
        registerPage.emailTextBox.sendKeys("abchotmail.com");
    }

    @Then("Kullanici Hata Aldigini dogrular")
    public void kullaniciHataAldiginiDogrular() {
        Assert.assertTrue(registerPage.mailIcon.isDisplayed());
    }

    @And("Close Driver")
    public void closeDriver() {
        Driver.closeDriver();
    }



}

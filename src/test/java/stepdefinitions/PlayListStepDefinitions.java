package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.DashBoardPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PlayListStepDefinitions {
    DashBoardPage dashBoardPage = new DashBoardPage();

//    Screen Create
    @When("Kullanici Oynatma Listeleri Butonuna Tiklar")
    public void kullanici_oynatma_listeleri_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.oynatmaListeleriButton);
    }

    @When("Kullanici Oynatma Listesi Ekle Butonuna Tiklar")
    public void kullanici_oynatma_listesi_ekle_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.oynatmaListesiEkleButton);
    }

    @When("Kullanici Oynatma Listesi Adi Girer")
    public void kullanici_oynatma_listesi_adi_girer() {
        dashBoardPage.oynatmaListesiAdiTextBox.sendKeys("Deneme");
    }

    @When("Kullanici Gorsel Ekle butonuna tiklar")
    public void kullanici_gorsel_ekle_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.gorselEkleButton);
    }

    @When("Kullanici Gorsel Secer ve Gorselleri Ekle Butonuna Tiklar")
    public void kullanici_gorsel_secer_ve_gorselleri_ekle_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.gorsel);
        ReusableMethods.clickWithJS(dashBoardPage.gorselleriEkleButton);
    }

    @When("Kullanici Kayit Et Butonuna tiklar")
    public void kullanici_kayit_et_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.kayitEtButton);
        ReusableMethods.waitFor(1);
    }

    @Then("Kayit Edildi Mesajini Dogrular")
    public void kayit_edildi_mesajini_dogrular() {
        Assert.assertTrue(dashBoardPage.kayitEdildiDogrulamaMessage.isDisplayed());
    }

//    ScreenCreate Negative

    @When("Kullanici Gorsel Eklemeden Kaydet Butonuna Tiklar")
    public void kullaniciGorselEklemedenKaydetButonunaTiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.kayitEtButton);
    }

    @Then("Kullanici Hata Mesaji Alir")
    public void kullaniciHataMesajiAlir() {
        Assert.assertTrue(dashBoardPage.hataMessage.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @When("Kullanici Oynatma Listesi Adi Giremeden ve Gorsel Eklemeden Kayit Et Butonuna Tiklar")
    public void kullaniciOynatmaListesiAdiGiremedenVeGorselEklemedenKayitEtButonunaTiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.kayitEtButton);
    }

    @When("Kullanici Oynatma Listesileri Arasindan Random Birinin Duzenle Butonuna Tiklar")
    public void kullaniciOynatmaListesileriArasindanRandomBirininDuzenleButonunaTiklar() {
        ReusableMethods.randomClick(dashBoardPage.duzenleButtonList);

    }
}

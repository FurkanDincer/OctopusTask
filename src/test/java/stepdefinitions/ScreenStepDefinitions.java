package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;
import utilities.ReusableMethods;

public class ScreenStepDefinitions {
    Faker faker=new Faker();
    String sevenChNumber=faker.number().digits(7);
    String sixChNumber=faker.number().digits(6);
    String eightChNumber=faker.number().digits(8);
    String screenName=faker.funnyName().name();
    DashBoardPage dashBoardPage=new DashBoardPage();

    //Screen Create Feature
    @When("Kullanici Ekranlar Butonuna Tiklar")
    public void kullanici_ekranlar_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.ekranlarButton);
    }
    @When("Kullanici Ekran Ekle Butonuna Tiklar")
    public void kullanici_ekran_ekle_butonuna_tiklar() {
        ReusableMethods.clickWithJS(dashBoardPage.ekranEkleButton);
    }
    @When("Kullanici Ekran Adi Girer")
    public void kullanici_ekran_adi_girer() {
        dashBoardPage.ekranAdiTextBox.sendKeys(screenName);
    }
    @When("Kullanici Oynatma Listesi Secer")
    public void kullanici_oynatma_listesi_secer() {
        Select select=new Select(dashBoardPage.oynatmaListeliDropDown);
        select.selectByVisibleText("OctopusDeneme");
    }
    @When("Kullanici Yedi Haneli Ekran Kodu Girer")
    public void kullaniciYediHaneliEkranKoduGirer() {
        dashBoardPage.ekranKoduTextBox.sendKeys(sevenChNumber);
    }

    //Screen Negative Feature-- Boundary Value
    @When("Kullanici Alti Haneli Ekran Kodu Girer")
    public void kullaniciAltiHaneliEkranKoduGirer() {
        dashBoardPage.ekranKoduTextBox.sendKeys(sixChNumber);
    }
    @When("Kullanici Sekiz Haneli Ekran Kodu Girer")
    public void kullaniciSekizHaneliEkranKoduGirer() {
        dashBoardPage.ekranKoduTextBox.sendKeys(eightChNumber);
    }
    //---------------------------------------------------

    //Screen Edit Feature
    @When("Kullanici Ekran Listesileri Arasindan Random Birinin Duzenle Butonuna Tiklar")
    public void kullanici_ekran_listesileri_arasindan_random_birinin_duzenle_butonuna_tiklar() {
       ReusableMethods.randomClick(dashBoardPage.duzenleButtonList);
    }
    @When("Kullanici Ekran Adini Degistirir")
    public void kullanici_ekran_adini_degistirir() {
        dashBoardPage.ekranAdiTextBox.clear();
        dashBoardPage.ekranAdiTextBox.sendKeys(screenName);
    }
    //----------------------------------------------



}

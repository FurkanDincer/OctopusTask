package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashBoardPage {

    public DashBoardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[text()='Octopus Digital Signage']" )
    public WebElement octopusLogo;

    @FindBy(partialLinkText ="İçerikler" )
    public WebElement iceriklerButton;

    @FindBy(partialLinkText ="Ekranlar" )
    public WebElement ekranlarButton;

    @FindBy(xpath ="//button[text()='Ekran Ekle']" )
    public WebElement ekranEkleButton;

    @FindBy(id ="title" )
    public WebElement ekranAdiTextBox;

    @FindBy(id ="uuid" )
    public WebElement ekranKoduTextBox;

    @FindBy(id ="playlist" )
    public WebElement oynatmaListeliDropDown;


    @FindBy(partialLinkText ="Oynatma Listeleri" )
    public WebElement oynatmaListeleriButton;

    @FindBy(xpath ="//button[text()='İçerik Yükle']" )
    public WebElement icerikYukleButton;

    @FindBy(xpath ="//button[text()='Oynatma Listesi Ekle']" )
    public WebElement oynatmaListesiEkleButton;

    @FindBy(id ="name" )
    public WebElement oynatmaListesiAdiTextBox;

    @FindBy(xpath ="//button[text()='Görsel Ekle']" )
    public WebElement gorselEkleButton;

    @FindBy(xpath ="//button[text()='Görselleri Ekle']" )
    public WebElement gorselleriEkleButton;

    @FindBy(xpath ="//button[text()='Kayıt Et']" )
    public WebElement kayitEtButton;

    @FindBy(xpath ="//*[text()='Kayıt Edildi!']" )
    public WebElement kayitEdildiDogrulamaMessage;

    @FindBy(xpath ="(//img)[1]" )
    public WebElement gorsel;

    @FindBy(xpath ="//div[text()='Bir şeyler ters gitti.']" )
    public WebElement hataMessage;

    @FindBy(xpath ="(//input[@class='uppy-Dashboard-input'])[1]" )
    public WebElement uploadButton;

    @FindBy(xpath ="//button[text()='Düzenle']" )
    public List<WebElement> duzenleButtonList;



}

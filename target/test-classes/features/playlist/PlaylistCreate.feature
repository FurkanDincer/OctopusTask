@smoke
Feature: Kullanici Oynatma Listesi Ekleyebilmeli

  Scenario: Kullanici_Oynatma_Listesi_Ekleyebilmeli

    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Oynatma Listeleri Butonuna Tiklar
    When Kullanici Oynatma Listesi Ekle Butonuna Tiklar
    When Kullanici Oynatma Listesi Adi Girer
    When Kullanici Gorsel Ekle butonuna tiklar
    And Kullanici Gorsel Secer ve Gorselleri Ekle Butonuna Tiklar
    And Kullanici Kayit Et Butonuna tiklar
    Then Kayit Edildi Mesajini Dogrular
    And Close Driver













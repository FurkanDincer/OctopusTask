@smoke
Feature: Kullanici Oynatma Listesi Ekleyebilmeli

  Scenario: Kullanici_Oynatma_Listesi_Ekleyememeli

    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Oynatma Listeleri Butonuna Tiklar
    When Kullanici Oynatma Listesi Ekle Butonuna Tiklar
    When Kullanici Oynatma Listesi Adi Giremeden ve Gorsel Eklemeden Kayit Et Butonuna Tiklar
    Then Kullanici Hata Mesaji Alir
    And Close Driver
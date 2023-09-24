@smoke
Feature: Kullanici Ekran Ekleyebilmeli

  Scenario: Kullanici_Ekran_Ekleyememeli
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Ekranlar Butonuna Tiklar
    When Kullanici Ekran Ekle Butonuna Tiklar
    When Kullanici Ekran Adi Girer
    When Kullanici Sekiz Haneli Ekran Kodu Girer
    When Kullanici Oynatma Listesi Secer
    When Kullanici Kayit Et Butonuna tiklar
    When Kullanici Hata Mesaji Alir
    And Close Driver

@smoke
Feature: Kullanici Ekran Ekleyebilmeli

  Scenario: Kullanici_Ekran_Ekleyebilmeli
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Ekranlar Butonuna Tiklar
    When Kullanici Ekran Ekle Butonuna Tiklar
    When Kullanici Ekran Adi Girer
    When Kullanici Yedi Haneli Ekran Kodu Girer
    When Kullanici Oynatma Listesi Secer
    When Kullanici Kayit Et Butonuna tiklar
    When Kayit Edildi Mesajini Dogrular
    And Close Driver








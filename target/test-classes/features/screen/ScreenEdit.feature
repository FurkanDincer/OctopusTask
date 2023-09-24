@smoke
Feature: Kullanici Ekran Bilgisi Düzenleyebilmeli

  Scenario: Kullanici_Ekran_Bilgisi_Düzenleyebilmeli
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Ekranlar Butonuna Tiklar
    When Kullanici Ekran Listesileri Arasindan Random Birinin Duzenle Butonuna Tiklar
    When  Kullanici Ekran Adini Degistirir
    When Kullanici Kayit Et Butonuna tiklar
    When  Kayit Edildi Mesajini Dogrular
    And Close Driver





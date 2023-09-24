@smoke
  Feature: Kullanici Oynatma Listesi Düzenleyebilmeli
    Scenario: Kullanici_Oynatma_Listesi_Düzenleyebilmeli
      Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
      And Kullanici Login Olur ve Login oldugunu dogrular
      When Kullanici Oynatma Listeleri Butonuna Tiklar
      When Kullanici Oynatma Listesileri Arasindan Random Birinin Duzenle Butonuna Tiklar
      And Kullanici Kayit Et Butonuna tiklar
      Then Kayit Edildi Mesajini Dogrular
      And Close Driver






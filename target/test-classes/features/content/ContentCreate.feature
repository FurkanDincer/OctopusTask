@smokew
Feature: Kullanici Icerik Yukleyebilmeli

  Scenario: Kullanici_Icerik_Yukleyebilmeli

    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    And Kullanici Login Olur ve Login oldugunu dogrular
    When Kullanici Icerikler alanina tiklar
    When Kullanici Icerik Yukle butonuna tiklar
    When Kullanici Masaustunden bir icerik secer
    When Kullanici Icerik Yuklendi mesajini dogrular
    And Close Driver








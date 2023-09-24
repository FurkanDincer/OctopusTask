@smoke
Feature: Kullanici Login Olabilmelidir

  Scenario: Kullanici_Login_Olabilmelidir
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    When Kullanici Kayitli Email Adresini Girer
    When Kullanici Sifre Girer
    When Kullanici Login Butonuna Tiklar
    And Kullanici Anasayfada Oldugunu Dogrular
    And Close Driver
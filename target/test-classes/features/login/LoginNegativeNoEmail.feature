@smoke
Feature: Kullanici Login Olamamalidir

  Scenario: Kullanici_Login_Olamamalidir
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    When Kullanici Email alanini bos birakir
    When Kullanici Sifre Girer
    When Kullanici Login Butonuna Tiklar
    And Kullanici Hata Aldigini dogrular
    And Close Driver
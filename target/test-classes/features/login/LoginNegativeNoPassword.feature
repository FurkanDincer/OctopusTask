@smoke
Feature: Kullanici Login Olamamalidir
  Scenario: Kullanici_Login_Olamamalidir
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    When Kullanici @ simgesi kullanmadan Email girer
    When Kullanici Sifre Alanlarini Bos Birakir
    When Kullanici Login Butonuna Tiklar
    And Kullanici Hata Aldigini dogrular
    And Close Driver
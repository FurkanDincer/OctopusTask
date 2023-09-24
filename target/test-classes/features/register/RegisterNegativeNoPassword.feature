@smoke
Feature: Register_Negative
  Scenario: Kullanici Kayit Olamamalidir
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
    When  Kullanici Kayit Ol butonuna tiklar
    When Kullanici İsim Soyisim girer
    When Kullanici Email girer
    When Kullanici Sifre Alanlarini Bos Birakir
    When Kullanici Register Kayit Ol butonuna tiklar
    Then Kullanici Hata Aldigini dogrular
    And Close Driver
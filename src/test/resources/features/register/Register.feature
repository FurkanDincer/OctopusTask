@smoke
  Feature: Register_Positive
    Scenario: Kullanici Kayit Olabilmelidir
    Given Kullanici "https://octopus-panel-case.azurewebsites.net/login" adresine gider
   When  Kullanici Kayit Ol butonuna tiklar
    When Kullanici İsim Soyisim girer
    When Kullanici Email girer
    When Kullanici Sifre girer
    When Kullanici Sifre Tekrar girer
    When Kullanici Register Kayit Ol butonuna tiklar
    Then Kullanici Kayit Oldugunu dogrular
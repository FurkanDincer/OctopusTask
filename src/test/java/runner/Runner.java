package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)    //test çalıştırıcı notasyonu
@CucumberOptions(   // Seneryoların nerede ve nasıl çalışacağı,hangi raporu kullanılmasıyla

        plugin = {              // Raporlama icin
                "pretty",       // raporlarin console da okunakli sekilde cikmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json", // json = javascript object notation
                "junit:target/xml-report/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,      // raporlarin daha okunakli olmasi icin

        features = "./src/test/resources/features",  // features folder path
        glue = {"stepdefinitions","hooks_ui"},       // stepdefinitions path
        tags = "@smoke",
        dryRun = false
)
public class Runner {

}

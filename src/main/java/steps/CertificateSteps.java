package steps;

import configuration.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CertificatePage;

public class CertificateSteps extends BaseClass {
    static {
        if(driver == null) {
            BaseClass.create();
        }
    }
    CertificatePage certificatePage = new CertificatePage(driver);
    @Before
    public void openPage() {
        driver.navigate().to("https://certificate.ithillel.ua/");
    }

    @When("I send certificate number {string}")
    public void iSendCertificateNumber(String number) {
        certificatePage.sendNumber(number);
    }
    @Then("I check result {string}")
    public void iCheckResult(String result) throws Exception {
        Assert.assertEquals(Boolean.valueOf(result),certificatePage.checkCertificateCheckForm());
    }
}

package com.briteerp.step_definitions;

import com.briteerp.pages.LoginPage;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class SmokeTestsStepDefinitions {

    @Given("I login into Brite ERP as an admin")
    public void i_login_into_Brite_ERP_as_an_admin() {
        String email = ConfigurationReader.getProperty("email");
        String password = ConfigurationReader.getProperty("password");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().signIn(email, password);

        assertTrue(new WebDriverWait(Driver.getDriver(), 10).until
                (ExpectedConditions.titleIs("#Inbox - Odoo")));
    }

    @Then("I should be able to access all application modules")
    public void i_should_be_able_to_access_all_application_modules() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("I should be able to see my personal preferences")
    public void i_should_be_able_to_see_my_personal_preferences() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}

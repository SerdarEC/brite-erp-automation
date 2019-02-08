package com.briteerp.tests.point_of_sale.dashboard;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class LoginTest extends TestBase {

    // open the application
    // enter login information
    @Test
    public void loginTest() {
        // if we dont create a test in the test method, this test will not show up in the report.html
        extentLogger = report.createTest("Login test");
        pages.loginPage.briteErpDemoDB.click();
//        pages.loginPage.email.sendKeys(ConfigurationReader.getProperty("email"));

    }


    @Test
    public void anotherloginTest() {
        // if we dont create a test in the test method, this test will not show up in the report.html
        extentLogger = report.createTest("Login test two");
        fail();
    }
}

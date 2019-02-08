package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
    public WebElement briteErpDemoDB;

    @FindBy(id = "login")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;
}

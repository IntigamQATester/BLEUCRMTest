package com.bleucrm.pages;

import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage{



    @FindBy(css = "#login-popup > form > div:nth-child(4) > div:nth-child(1) > input")
    public WebElement userloginBox;

    @FindBy(css = "#login-popup > form > div:nth-child(4) > div:nth-child(2) > input")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/input")
    public WebElement submit;

    @FindBy(id = "LIVEFEED_search")
    public WebElement filterSearch;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_search_container\"]/div/div/div[2]/div[2]/span[1]")
    public WebElement addField;

    @FindBy(xpath = "//*[@id=\"popup-window-content-LIVEFEED_fields_popup\"]/div")
    public WebElement fields;

    @FindBy(css = "div[class='popup-window-content']")
    public WebElement fieldsList;




    
//    public void login() throws InterruptedException {
//        String url = ConfigurationReader.get("url");
//        Driver.get().get(url);
//        Thread.sleep(3000);
//       // signInButton.click();
//      //  loginBox.sendKeys(ConfigurationReader.get("username"));
//        passwordBox.sendKeys(ConfigurationReader.get("password"));
//        submit.click();
//        Driver.get().navigate().back();
//


















//        if(username.equals(ConfigurationReader.get("username")) && password.equals(ConfigurationReader.get("password"))){
//            advancedButton.click();
//            proceedLink.click();
//       signInButton.click();
//       loginBox.sendKeys(username);
//       passwordBox.sendKeys(password);
//        submit.click();
//        Driver.get().navigate().back();
    }


package logics;

import helper.seleniumHelper;
import org.openqa.selenium.WebDriver;
import pages.paraBankHomePage;

import java.util.Properties;

public class testCase1 extends seleniumHelper {

    static paraBankHomePage hp=new paraBankHomePage();
    static testCase1 tc=new testCase1();
    public static void main(String args[])
    {

        WebDriver browser=tc.initBrowser();
        tc.launchURL(browser,"https://parabank.parasoft.com/parabank/index.htm");
        tc.validateUserName(browser);

    }

    public void validateUserName(WebDriver browser)
    {
        tc.presenceOfElement(browser,hp.username);
        tc.clickButton(browser,hp.login);
        tc.textMessageCheck("Please enter a username and password.",browser,hp.errorMessage);
    }
}

package Logics;

import Objects.Page1;
import Resuable.Resuablecode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Testcaseexe extends Resuablecode {
    static Page1 hp = new Page1();
    static Testcaseexe tc = new Testcaseexe();
    static WebDriver d;
    static Properties prop = new Properties();

    public static void main(String args[]) throws Exception {
        //@BeforeSuite

        System.out.println("Init Browser");
        WebDriver d;
        FileReader file = new FileReader("hy.properties");
        Properties prop = new Properties();
        prop.load(file);
        String URL = prop.get("URL").toString();
        String Username = prop.get("Username").toString();
        d = initBrowser();
        tc.launchURL(d, URL);
        tc.Testcase1(d);
        tc.Testcase2(d);
        tc.testcase3(d);
        tc.testcase4(d);
        tc.Testcase5();
    }

    public void repetablecode(WebDriver d) throws IOException {
        FileReader file = new FileReader("hy.properties");
        Properties prop = new Properties();
        prop.load(file);
        String URL = prop.get("URL").toString();
        String Username = prop.get("Username").toString();
        String Password = prop.get("Password").toString();
       //d=initBrowser();
        tc.launchURL(d,URL);
        tc.clickButton(d, hp.accounttext);
        tc.clickButton(d, hp.Myaccounttext);
        System.out.println("Checking Username inputs");
        tc.elementToBeClickable(d, hp.email);
        tc.elementToBeClickable(d, hp.password);
        tc.EnterText(d, hp.email, Username);
        tc.EnterText(d, hp.password, Password);
        tc.clickButton(d, hp.login);
    }

    public void Testcase1(WebDriver d) throws InterruptedException, IOException {
        d=initBrowser();
        tc.repetablecode(d);
        d.close();
        System.out.println("Testcase1 is PASS");

    }

    public void Testcase2(WebDriver d) throws IOException {
        //Scenario1: checking login without password input
        d = initBrowser();
        tc.launchURL(d, "http://live.demoguru99.com/");
        tc.clickButton(d, hp.accounttext);
        tc.clickButton(d, hp.Myaccounttext);
        tc.EnterText(d, hp.email, "huddjss@gmail.com");
        tc.clickButton(d, hp.login);
        //tc.EnterText(d,hp.password,Password);
        tc.textisdiaplyed(d, hp.passwordtxt);
        d.close();
        //Scenario2:Checking login with invalid Username and Password
        d = initBrowser();
        tc.launchURL(d, "http://live.demoguru99.com/");
        tc.clickButton(d, hp.accounttext);
        tc.clickButton(d, hp.Myaccounttext);
        tc.EnterText(d, hp.email, "huddjss@gmail.com");
        tc.EnterText(d, hp.password, "bhjsbhd");
        tc.clickButton(d, hp.login);
        tc.textisdiaplyed(d, hp.errortext);
        tc.clickButton(d, hp.login);
        d.close();

    }

    public void testcase3(WebDriver d) throws IOException {
        d = initBrowser();
        tc.repetablecode(d);
        tc.clickButton(d, hp.mobile);
        tc.clickButton(d, hp.Iphone);
        tc.clickButton(d, hp.Coun);
        tc.EnterText(d, hp.state, "Tamilnadu");
        tc.EnterText(d, hp.pincode, "641026");
        tc.clickButton(d, hp.protoChkout);
        d.close();

    }


    public void testcase4(WebDriver d) throws IOException, InterruptedException {
        d=initBrowser();
        tc.repetablecode(d);
        tc.clickButton(d, hp.mobile);
        //tc.clickButton(d, hp.Iphone);
        tc.clickButton(d,hp.wishlistIp);
        textMessageCheck("$500.00",d,hp.price);
        tc.clickButton(d,hp.Addalltocart);
        tc.clickButton(d,hp.protoChkout);
        Thread.sleep(6000);
        d.close();
            }

        public void Testcase5() throws IOException, InterruptedException {
            d=initBrowser();
            tc.repetablecode(d);
            tc.clickButton(d, hp.mobile);
            tc.clickButton(d,hp.Iphone);
            tc.clickButton(d,hp.addtocarticon);
            //tc.clickButton(d,hp.quantity);
            //tc.EnterText(d,hp.quantity,"7");
            //Thread.sleep(6000);
            //tc.clickButton(d,hp.Okdynamic);
            tc.clickButton(d,hp.checkoutshort);


        }
}






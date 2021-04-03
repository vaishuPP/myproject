package Resuable;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resuablecode {

    public static WebDriver initBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }

    public static void launchURL(WebDriver driver, String url)
    {
        System.out.println("Launching the URL "+url);
        driver.get(url);
    }
    public void presenceOfElement(WebDriver driver, By locator)
    {
        System.out.println(locator+" checking presences");
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void elementToBeClickable(WebDriver driver,By locator)
    {
        System.out.println(locator+" checking cliclable");
        WebDriverWait wait=new WebDriverWait(driver,20);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            throw new ElementNotInteractableException(locator+" not interacing with the element");
        }


    }

    public void EnterText(WebDriver driver,By locator, String textToEnter)
    {
        elementToBeClickable(driver,locator);
        WebElement element=driver.findElement(locator);
        element.sendKeys(textToEnter);
    }

    public void clickButton(WebDriver driver,By locator)
    {
        presenceOfElement(driver,locator);
        elementToBeClickable(driver,locator);
        WebElement element= driver.findElement(locator);
        element.click();
    }
    public boolean textMessageCheck(String expected, WebDriver driver,By locator)
    {
        boolean textCheck=false;
        presenceOfElement(driver,locator);
        WebElement element=driver.findElement(locator);
        String actual=element.getText();
        if(actual.equals(expected))
        {
            System.out.println("Text Check is getting passed");
            textCheck=true;
        }else {
            throw new AssertionError(expected+" is not matching with ");
        }

        return textCheck;
    }

    public void textisdiaplyed(WebDriver driver,By locator)
    {
        WebElement El= driver.findElement(locator);
        Boolean testq=El.isDisplayed();
        System.out.println(testq);
        if(testq=Boolean.TRUE) {
            System.out.println("Testcase is PASS");
        }
        else
        {
            System.out.println("Testcase is Fail");
        }
                }

    }




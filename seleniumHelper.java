package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumHelper {

    public WebDriver initBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }

    public void launchURL(WebDriver driver,String url)
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

    public void clickButton(WebDriver browser,By locator)
    {
        presenceOfElement(browser,locator);
        elementToBeClickable(browser,locator);
        WebElement element= browser.findElement(locator);
        element.click();
    }
    public boolean textMessageCheck(String expected, WebDriver browser,By locator)
    {
        boolean textCheck=false;
        presenceOfElement(browser,locator);
        WebElement element=browser.findElement(locator);
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

}

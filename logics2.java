package demoApplit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class logics2 {
    public static void main(String args[])
    {
        System.setProperty("web.chrome.driver","chrome driver");
        WebDriver d = new ChromeDriver();
        //Webpage loading
        d.get("https://www.saucedemo.com/");
        System.out.println("Webpage loaded successfully");
        // login field
        //Username
        WebElement Username = d.findElement(By.xpath("//div[@id=\"login_credentials\"]"));
        String Username1 = Username.getText();
        System.out.println(Username1);
        String str = Username1;
        String result =str.substring(24,37);
        System.out.println("The Username is " +result);
        d.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(result);
        //Password
        WebElement password =d.findElement(By.xpath("//div[@class=\"login_password\"]"));
        String Password1 = password.getText();
        System.out.println(Password1);
        String str2=Password1;
        String result1=str2.substring(24,36);
        System.out.println(result1);
        d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(result1);
        //d.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        d.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        //Selecting product page
        d.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[1]")).click();
        //add to cart
        WebElement Cartvalue=d.findElement(By.xpath("//span[text()=\"1\"]"));
        String Cartvaluedisplay=Cartvalue.getText();
        System.out.println("The cart badge value is"+Cartvaluedisplay);
        d.findElement(By.xpath("//*[@role=\"img\"]")).click();
        //Checkout
        WebElement Bag= d.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
        String ActText = Bag.getText();
        System.out.println("Selected Bag is"+ActText);
        String ExpdTest = "Sauce Labs Backpack";
        if(ActText.equalsIgnoreCase(ExpdTest))
            System.out.println("Result matched");
        else
            System.out.println("Result not matched");
        d.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
        //Checkout -User info
        d.findElement(By.xpath("//input[@value=\"CONTINUE\"]")).click();
        WebElement error=d.findElement(By.xpath("//*[@data-test=\"error\"]"));
        Boolean ErrorDisplay=error.isDisplayed();
        if(ErrorDisplay)
            System.out.println("True");
        else
            System.out.println("False");

    //inputdetails
        d.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("indira");
        d.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("M");
        d.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("641026");
        d.findElement(By.xpath("//input[@value=\"CONTINUE\"]")).click();
        //Cart details
        WebElement cartnum=d.findElement(By.xpath("//div[@class=\"summary_value_label\"][1]"));
        String cartnumber=cartnum.getText();
        System.out.println("The cartt number entered is"+cartnumber);
        d.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]")).click();
        //final order
        WebElement Order=d.findElement(By.xpath("//h2[@class=\"complete-header\"]"));
        Boolean OrderDisplay=Order.isDisplayed();
        if(OrderDisplay)
            System.out.println("true");
        else
            System.out.println("False");
        d.close();




    }

}

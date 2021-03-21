package pages;

import org.openqa.selenium.By;

public class paraBankHomePage {
    public By username= By.xpath("//input[@name='username']");
    public By password= By.xpath("//input[@name='password']");
    public By login=By.xpath("//input[@class='button']");
    public By errorMessage=By.xpath("//p[@class='error']");
}

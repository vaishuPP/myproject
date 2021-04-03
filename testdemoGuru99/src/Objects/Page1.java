package Objects;

import org.openqa.selenium.By;

public class Page1 {
    //Page1
    public By accounttext=By.xpath("//span[@class=\"label\" and text()=\"Account\"]");
    public By Myaccounttext=By.xpath("//div[@id=\"header-account\"]//descendant::li//child::a[@title=\"My Account\"]");
    //Page2
    public By email=By.xpath("//input[@name=\"login[username]\"]");
    public By password=By.xpath("//input[@name=\"login[password]\"]");
    public By login=By.xpath("//button[@id=\"send2\"]");
    public By passwordtxt=By.xpath("//div[@class=\"validation-advice\"]");
    public By errortext=By.xpath("//li[@class=\"error-msg\"]");

    //Page3
    public By mobile =By.xpath("//a[text()=\"Mobile\"]");
    public By Iphone=By.xpath("//a[@title=\"IPhone\"]//parent::h2//parent::div//child::div[@class=\"actions\"]//child::button[@title=\"Add to Cart\"]");
    public By samsung=By.xpath("//a[@title=\"Samsung Galaxy\"]//parent::h2//parent::div//child::div[@class=\"actions\"]//child::button[@title=\"Add to Cart\"]");
    public By sony=By.xpath("//a[@title=\"Sony Xperia\"]//parent::h2//parent::div//child::div[@class=\"actions\"]//child::button[@title=\"Add to Cart\"]");
    public By wishlistIp=By.xpath("//a[@title=\"IPhone\"]//parent::h2//parent::div//child::div[@class=\"actions\"]//child::ul[@class=\"add-to-links\"]//child::a[@class=\"link-wishlist\"]");
    //Page4
    public By AddtoC=By.xpath("//button[@title=\"Add to Cart\"]");
    public By Addalltocart=By.xpath("//button[@title=\"Add All to Cart\"]");
    //Page5
    public By price=By.xpath("//span[@id=\"product-price-2\"]//child::span[@class=\"price\"]");
    public By Coun=By.xpath("//option[@value=\"IN\"]");
    public By state=By.xpath("//input[@name=\"region\"]");
    public By pincode=By.xpath("//input[@id=\"postcode\"]");
    public By protoChkout=By.xpath("//ul[@class=\"checkout-types bottom\"]//child::li//child::button");
    //..
    public By addtocarticon=By.xpath("//div[@class=\"header-minicart\"]");
    public By quantity=By.xpath("//button[@id=\"qbutton-150661\"]");
    public By Okdynamic=By.xpath("//input[@id=\"qinput-150661\"]");
    public By checkoutshort=By.xpath("//ul[@class=\"checkout-types minicart\"]");
}

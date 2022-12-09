package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils
{
    private By _registrationButton = By.className("ico-register");
    public void verifyRegistrationButtonIsonHomePage(){
        //Asserts that two objects are equal
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","You are on Registration Page");

    }
    public void clickOnRegisterButton()
    {
        ClickonElement(_registrationButton);
    }
    public void clickonCelPhon(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
        action.moveToElement(element).perform();
        ClickonElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/cell-phones\"]"));

    }
    public void clickOnCategoryPage(String category){
        ClickonElement(By.linkText(category));
    }

}

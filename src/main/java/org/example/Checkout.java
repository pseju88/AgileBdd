package org.example;

import org.openqa.selenium.By;

import static org.example.BasePage.driver;
import static org.example.Utils.selectFromDropdownByVisibleText;

public class Checkout extends Utils {
    private By _ContinbueButton = By.cssSelector("button.button-1.new-address-next-step-button");


    //private By _ContinbueButton = By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]");

    public void verifybilling(){

        selectFromDropdownByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        EnterText(By.id("BillingNewAddress_City"),"surrey");
        EnterText(By.id("BillingNewAddress_Address1"),"254,High Street");
        EnterText(By.id("BillingNewAddress_ZipPostalCode"),"Gu6 8rt");
        EnterText(By.id("BillingNewAddress_PhoneNumber"),"07472467367");
        ClickonElement(By.id("billing-buttons-container"));
        //driver.switchTo().alert().accept();
       // ClickonElement(By.linkText("Ground"));
       // ClickonElement(By.id("shipping-method-buttons-container"));
ClickonElement(_ContinbueButton);
    }
}

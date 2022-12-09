package org.example;

import org.openqa.selenium.By;

public class PaymentInformation extends Utils{
    public void verifypaymentInformation(){
        waitForElementToBeVisible(By.id("CreditCardType"),10);
        selectFromDropdownByVisibleText(By.id("CreditCardType"),"Visa");
        EnterText(By.id("CardholderName"),"Nansen Hsia");
        EnterText(By.id("CardNumber"),"4917578570862911");
        selectFromDropdownByVisibleText(By.id("ExpireMonth"),"05");
        selectFromDropdownByVisibleText(By.id("ExpireYear"),"2024");
        EnterText(By.id("CardCode"),"121");
        ClickonElement(By.cssSelector("button.button-1.payment-info-next-step-button"));
    }
}

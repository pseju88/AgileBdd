package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils{
    public void verifyPaymentMethod(){
        waitForElementToBeVisible(By.id("paymentmethod_1"),10);
        ClickonElement(By.id("paymentmethod_1"));
        ClickonElement(By.cssSelector("button.button-1.payment-method-next-step-button"));
    }
}

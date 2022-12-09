package org.example;

import org.openqa.selenium.By;

public class ShiipingMethod  extends Utils
{public void verifyShippingMethod(){
    waitForElementToBeVisible(By.id("shippingoption_1"),10);
    ClickonElement(By.id("shippingoption_1"));
    ClickonElement(By.cssSelector("button.button-1.shipping-method-next-step-button"));

    //ClickonElement(By.cssSelector("button.button-1.payment-info-next-step-button"));
    //ClickonElement(By.cssSelector("button.button-1.confirm-order-next-step-button"));
}
}


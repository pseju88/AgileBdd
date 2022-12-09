package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NokiaLumia extends Utils{
    public void addToCart() {
        Actions actions = new Actions(driver);


      ClickonElement  (By.id("add-to-cart-button-20"));
        waitForElementToBeVisible(By.cssSelector("span.close"),10);
        ClickonElement(By.cssSelector("span.close"));
        WebElement element1 = driver.findElement(By.className("cart-label"));
        actions.moveToElement(element1).perform();
        waitForElementToBeVisible(By.cssSelector("button.button-1.cart-button"),10);
        ClickonElement(By.cssSelector("button.button-1.cart-button"));

    }
}

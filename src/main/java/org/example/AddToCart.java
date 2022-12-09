package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AddToCart extends Utils
{
    public void verifyAddToCart(){

        driver.findElement(By.className("qty-input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.className("qty-input")).sendKeys("2");
        ClickonElement(By.id("updatecart"));
        ClickonElement(By.id("termsofservice"));
        ClickonElement(By.id("checkout"));



    }
}

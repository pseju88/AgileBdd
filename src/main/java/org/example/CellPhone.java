package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class CellPhone extends Utils{
    public void verifyCellPhoneOnElectronicPage(){

        Utils.assertCurrentURL("cell-phones");
        ClickonElement(By.linkText("Nokia Lumia 1020"));
    }
}

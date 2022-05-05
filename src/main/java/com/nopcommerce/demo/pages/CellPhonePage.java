package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By cellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewLink = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    public String getCellPhoneText(){
        return getTextFromElement(cellPhone);
    }
    public void clickOnListViewLink(){
        clickOnElement(listViewLink);
    }
    public void clickOnNokiaLomia(){
        clickOnElement(nokiaLumia);
    }
}


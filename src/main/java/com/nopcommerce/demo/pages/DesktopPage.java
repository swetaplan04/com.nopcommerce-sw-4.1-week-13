package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By sortBy = By.name("products-orderby");
    By priceLowToHighOptionText = By.xpath("//option[contains(text(),'Price: Low to High')]");
    By addToCartButton = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");

    public void clickOnSortByPriceLowToHigh()
    {

        selectByVisibleTextFromDropDown(sortBy,"Price: Low to High");
    }

    public String getPriceLowToHighOptionText()
    {
        return getTextFromElement(priceLowToHighOptionText);
    }
    public void clickOnSortByAToZ()
    {
        selectByVisibleTextFromDropDown(sortBy,"Name: A to Z");

    }
    public void clickOnAddToCartButton()
    {
        clickOnElement(addToCartButton);
    }
}



